package com.aaa.controller;

import com.aaa.entity.Author;
import com.aaa.service.AuthorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/13 15:02
 * @Description TODO
 */
@RestController
@RequestMapping("author")
public class AuthorCntroller {
@Resource
    AuthorService authorService;
@RequestMapping("query")
public List<Author> select(){
    return authorService.list();
}
@RequestMapping("saveOrUpdate")
    public boolean saveOrUpdate(Author author){
    return authorService.saveOrUpdate(author);
}
@RequestMapping("del")
    public boolean del(Integer id){
    return authorService.removeById(id);
}
}
