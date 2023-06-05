package com.aaa.controller;

import com.aaa.entity.Brand;
import com.aaa.entity.ResponseData;
import com.aaa.service.BrandService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/13 15:53
 * @Description TODO
 */
@RestController
@CrossOrigin("http://127.0.0.1:8848")
@RequestMapping("brand")
public class BrandController {
    @Resource
    BrandService brandService;
    @RequestMapping("query")
    public ResponseData select(){
        return ResponseData.ok(brandService.list());
    }
    @RequestMapping("saveOrUpdate")
    public boolean saveOrUpdate(Brand brand){
        return brandService.saveOrUpdate(brand);
    }
    @RequestMapping("del")
    public boolean del(Integer id){
        return brandService.removeById(id);
    }
}
