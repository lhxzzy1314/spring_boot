package com.aaa.controller;

import com.aaa.entity.ResponseData;
import com.aaa.entity.Users;
import com.aaa.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/29 22:50
 * @Description TODO
 */
@RestController
@CrossOrigin("http://127.0.0.1:8848")
@RequestMapping("users")
public class UsersController {
    @Resource
    UsersService usersService;
    @RequestMapping("query")
    public List<Users> query(){
        return usersService.list();
    }
    @RequestMapping("au")
    public boolean au(Users users){
        return usersService.saveOrUpdate(users);
    }
    @RequestMapping("del")
    public boolean del(Integer id){
        return usersService.removeById(id);
    }
}
