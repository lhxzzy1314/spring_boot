package com.aaa.controller;

import com.aaa.entity.ResponseData;
import com.aaa.entity.Type;
import com.aaa.service.TypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/13 16:00
 * @Description TODO
 */
@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("type")
public class TypeController {
    @Resource
    TypeService typeService;
    @RequestMapping("query")
    public ResponseData select(){
        return ResponseData.ok(typeService.list());
    }
    @RequestMapping("saveOrUpdate")
    public boolean saveOrUpdate(Type type){
        return typeService.saveOrUpdate(type);
    }
    @RequestMapping("del")
    public boolean del(Integer id){
        return typeService.removeById(id);
    }
}
