package com.aaa.security;

import com.aaa.entity.Users;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Component
public class RbacAccessHandler {

    // 请求 -> Rbac -> 认证校验|权限验证

    // true:可以访问 -> 权限验证
    // false:禁止访问
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        System.out.println("============rbac验证===========");
        // 判断是否登录
        if (authentication instanceof AnonymousAuthenticationToken) {
            // 未登录
            System.out.println("未登录请登陆");
            return true;
        } else {
            System.out.println("已登录请访问");
            // 已经登录
            Users users = (Users) authentication.getPrincipal();
            System.out.println(users.getRid());

            // 请求路径
            String uri = request.getRequestURI();
            System.out.println("路径"+uri);

            // 参数
            Enumeration<String> parameterNames = request.getParameterNames();
            while (parameterNames.hasMoreElements()) {
                System.out.println(request.getParameter(parameterNames.nextElement()));
            }

            return true;
        }
    }
}
