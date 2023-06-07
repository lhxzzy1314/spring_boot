package com.aaa.controller;

import com.aaa.entity.Publisher;
import com.aaa.entity.ResponseData;
import com.aaa.service.PublisherService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/13 15:57
 * @Description TODO
 */
@RestController
@RequestMapping("publisher")
public class PublisherController {
    @Resource
    PublisherService publisherService;
    @RequestMapping("query")
    public ResponseData select(){
        return ResponseData.ok(publisherService.list()) ;
    }
    @RequestMapping("saveOrUpdate")
    public boolean saveOrUpdate(Publisher publisher){
        return publisherService.saveOrUpdate(publisher);
    }
    @RequestMapping("del")
    public boolean del(Integer id){
        return publisherService.removeById(id);
    }
}
