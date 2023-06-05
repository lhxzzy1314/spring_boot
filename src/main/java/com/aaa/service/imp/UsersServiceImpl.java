package com.aaa.service.imp;

import com.aaa.dao.UsersMapper;
import com.aaa.entity.ResponseData;
import com.aaa.entity.Users;
import com.aaa.service.UsersService;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/23 16:24
 * @Description TODO
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    public ResponseData selects(){

        String sql="";
        return null;
    }

}
