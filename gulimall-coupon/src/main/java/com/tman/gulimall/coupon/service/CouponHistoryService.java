package com.tman.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tman.gulimall.common.utils.PageUtils;
import com.tman.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:11:42
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

