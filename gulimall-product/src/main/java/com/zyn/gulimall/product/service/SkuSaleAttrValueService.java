package com.zyn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyn.common.utils.PageUtils;
import com.zyn.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author zyn
 * @email 565964094@qq.com
 * @date 2020-09-21 11:24:56
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

