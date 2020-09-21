package com.zyn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyn.common.utils.PageUtils;
import com.zyn.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author zyn
 * @email 565964094@qq.com
 * @date 2020-09-21 11:24:56
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

