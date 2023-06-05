package com.aaa.service.imp;

import com.aaa.dao.BrandMapper;
import com.aaa.entity.Brand;
import com.aaa.service.BrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/13 15:52
 * @Description TODO
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
}
