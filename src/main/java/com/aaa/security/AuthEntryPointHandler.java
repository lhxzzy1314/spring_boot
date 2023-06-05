package com.aaa.security;

import com.aaa.entity.ResponseCode;
import com.aaa.entity.ResponseData;
import com.alibaba.fastjson.JSON;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AuthEntryPointHandler implements AuthenticationEntryPoint {

    /**
     * 未登录异常处理
     *
     * @param request
     * @param response
     * @param authException 认证异常
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        System.out.println("==============未登录===============");
        System.out.println(authException);

        PrintWriter writer = response.getWriter();
        writer.write(JSON.toJSONString(ResponseData.response(ResponseCode.NOT_AUTHENTICATION)));
        writer.flush();
        writer.close();
    }
}
