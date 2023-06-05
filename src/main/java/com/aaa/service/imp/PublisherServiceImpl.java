package com.aaa.service.imp;

import com.aaa.dao.PublisherMapper;
import com.aaa.entity.Publisher;
import com.aaa.service.PublisherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/13 15:55
 * @Description TODO
 */
@Service
public class PublisherServiceImpl extends ServiceImpl<PublisherMapper, Publisher> implements PublisherService {
}
