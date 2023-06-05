package com.aaa.service.imp;

import com.aaa.dao.AuthorMapper;
import com.aaa.entity.Author;
import com.aaa.service.AuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/13 14:29
 * @Description TODO
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {
}
