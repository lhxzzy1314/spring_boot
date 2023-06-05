package com.aaa.security;

import com.aaa.entity.ResponseData;
import com.alibaba.fastjson.JSON;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AuthFailureHandler implements AuthenticationFailureHandler {

    /**
     *
     * @param request
     * @param response
     * @param exception 验证异常
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        System.out.println(exception);

        /*
        BadCredentialsException: Bad credentials 用户名密码错误
        LockedException: User account is locked  账户被锁定
        DisabledException: User is disabled 账户被禁用
         */
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        System.out.println("===============登录失败=============");

        PrintWriter writer = response.getWriter();
        writer.write(JSON.toJSONString(ResponseData.error("失败")));
        writer.flush();
        writer.close();
    }
}
