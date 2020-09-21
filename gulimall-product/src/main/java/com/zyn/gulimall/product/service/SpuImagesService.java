package com.zyn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyn.common.utils.PageUtils;
import com.zyn.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zyn
 * @email 565964094@qq.com
 * @date 2020-09-21 11:24:56
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

