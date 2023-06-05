package com.aaa.service.imp;

import com.aaa.dao.TypeMapper;
import com.aaa.entity.Type;
import com.aaa.service.TypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/13 15:59
 * @Description TODO
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {
}
