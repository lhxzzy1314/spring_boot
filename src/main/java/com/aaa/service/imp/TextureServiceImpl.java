package com.aaa.service.imp;

import com.aaa.dao.TextureMapper;
import com.aaa.entity.Texture;
import com.aaa.service.TextureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author：LiuNiu
 * @DateTime:2023/5/23 10:55
 * @Description TODO
 */
@Service
public class TextureServiceImpl extends ServiceImpl<TextureMapper, Texture> implements TextureService  {
}
