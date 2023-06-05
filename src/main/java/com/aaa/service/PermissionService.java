package com.aaa.service;

import com.aaa.entity.Users;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service(value = "permissionService")
public class PermissionService {

    public boolean check() {
        System.out.println("==========check==========");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Users users = (Users) authentication.getPrincipal();
        System.out.println(users);
        return users.getUsername().equals("zhangsan");
    }

    public boolean hasRole(Authentication authentication, String uri) {
        Users users = (Users) authentication.getPrincipal();
        System.out.println(users);
        System.out.println(uri);
        return users.getUsername().equals("zhangsan");
    }
}


