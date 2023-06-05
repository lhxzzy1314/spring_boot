package com.aaa.service.imp;

import com.aaa.dao.RoleMapper;
import com.aaa.entity.Role;
import com.aaa.service.RoleService;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/23 16:17
 * @Description TODO
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
}
