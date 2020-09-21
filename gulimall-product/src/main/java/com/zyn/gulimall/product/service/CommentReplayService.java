package com.zyn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyn.common.utils.PageUtils;
import com.zyn.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zyn
 * @email 565964094@qq.com
 * @date 2020-09-21 11:24:56
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

