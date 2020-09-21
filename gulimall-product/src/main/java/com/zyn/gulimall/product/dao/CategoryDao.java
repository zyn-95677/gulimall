package com.zyn.gulimall.product.dao;

import com.zyn.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zyn
 * @email 565964094@qq.com
 * @date 2020-09-21 11:24:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
