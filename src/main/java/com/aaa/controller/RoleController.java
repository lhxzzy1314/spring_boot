package com.aaa.controller;

import com.aaa.entity.ResponseData;
import com.aaa.entity.Role;
import com.aaa.service.RoleService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/23 16:18
 * @Description TODO
 */
@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("role")
public class RoleController {
    @Resource
    RoleService roleService;
    @RequestMapping("query")
    public ResponseData query(){
        return ResponseData.ok(roleService.list());
    }
    @RequestMapping("updateOr")
    public boolean query2(Role role){
        return roleService.saveOrUpdate(role);
    }
    @RequestMapping("del")
    public boolean del(Integer id){
        return roleService.removeById(id);
    }
}
