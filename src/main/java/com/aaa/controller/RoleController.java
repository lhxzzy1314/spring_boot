package com.aaa.controller;

import com.aaa.entity.ResponseData;
import com.aaa.entity.Role;
import com.aaa.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/23 16:18
 * @Description TODO
 */
@RestController
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
