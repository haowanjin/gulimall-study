package com.tman.gulimall.coupon.dao;

import com.tman.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-05 00:18:12
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
