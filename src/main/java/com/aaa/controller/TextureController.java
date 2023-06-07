package com.aaa.controller;

import com.aaa.entity.ResponseData;
import com.aaa.entity.Texture;
import com.aaa.service.TextureService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/23 10:56
 * @Description TODO
 */
@RestController
@RequestMapping("texture")
public class TextureController {
    @Resource
    TextureService textureService;

    @RequestMapping("query")
    public ResponseData select(){
        return ResponseData.ok(textureService.list());
    }

    @RequestMapping("su")
    public boolean saveOrUpdate(Texture texture){
        return textureService.saveOrUpdate(texture);
    }

    @RequestMapping("del")
    public boolean del(Integer id){
        return textureService.removeById(id);
    }

}
