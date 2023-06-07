package com.aaa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public CorsFilter initCorsFilter() {
        // 跨域配置：规则
        CorsConfiguration config = new CorsConfiguration();
        // 允许的请求头
        config.addAllowedHeader("*");
        // 允许的请求域名
        config.addAllowedOriginPattern("*");
        // 允许的请求方式：GET,POST
        config.addAllowedMethod("*");
        // 允许携带凭证：session,cookie
        config.setAllowCredentials(true);

        // 基于URL配置源
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", config);

        // 跨域拦截器
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

}
