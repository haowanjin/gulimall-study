package com.tman.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tman.gulimall.common.utils.PageUtils;
import com.tman.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:11:42
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

