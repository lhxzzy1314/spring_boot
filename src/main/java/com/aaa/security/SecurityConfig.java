package com.aaa.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsUtils;

import javax.annotation.Resource;

// 启用security
@EnableWebSecurity
// 启用注解权限
@EnableGlobalMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    UserDetailsConfg userDetailsConfg;

    @Resource
    AuthSuccessHandler authSuccessHandler;

    @Resource
    AuthFailureHandler authFailureHandler;

    @Resource
    AuthEntryPointHandler authEntryPointHandler;

    @Resource
    LogoutHandler logoutHandler;

    @Resource
    AccDeniedHandler accDeniedHandler;

    /**
     * 配置HTTP请求
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 表单登录
        http.formLogin().successHandler(authSuccessHandler).failureHandler(authFailureHandler).permitAll();
        http.logout().logoutSuccessHandler(logoutHandler);
        // 授权请求如何访问
        http.authorizeRequests()
                .requestMatchers(CorsUtils::isPreFlightRequest)
                .permitAll()
                .anyRequest()
                // 访问：根据方法的返回值判断是否可以访问，返回true可以访问，false禁止访问
                .access("@rbacAccessHandler.hasPermission(request,authentication)");
        // 必须认证
        //.authenticated();

        // 异常处理器
        http.exceptionHandling()
                // 身份验证失败：没有登录
                .authenticationEntryPoint(authEntryPointHandler)
                // 权限不足：已经登录，但是访问被拒绝
                .accessDeniedHandler(accDeniedHandler);

        http.cors().and().csrf().disable();
    }

    /**
     * 认证配置:默认所有密码必须加密
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 用户信息保存在内存中
         auth.inMemoryAuthentication()
                // 密码加密器：对自动对请求传递过来的密码进行加密
                .passwordEncoder(new BCryptPasswordEncoder());
        // 用户详情服务
        // 根据请求用户名获取正确的用户详细信息，再拿着正确的密码和表单提交的密码做对比(自动)
        auth.userDetailsService(userDetailsConfg)
                .passwordEncoder(new BCryptPasswordEncoder());

    }

}



