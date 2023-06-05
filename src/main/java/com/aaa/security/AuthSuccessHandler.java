package com.aaa.security;

import com.aaa.entity.ResponseData;
import com.aaa.entity.Users;
import com.alibaba.fastjson.JSON;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AuthSuccessHandler implements AuthenticationSuccessHandler {

    /**
     * @param request 请求
     * @param response 响应
     * @param authentication 认证信息：用户信息
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        System.out.println("================登录成功=============");
        Users users = (Users) authentication.getPrincipal();
        System.out.println(users);

        PrintWriter writer = response.getWriter();
        writer.write(JSON.toJSONString(ResponseData.ok(users)));
        writer.flush();
        writer.close();
    }

}
