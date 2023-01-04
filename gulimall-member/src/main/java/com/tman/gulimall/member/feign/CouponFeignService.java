package com.tman.gulimall.member.feign;

import com.tman.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author haowanjin
 * @date 2023/1/5 0:29
 * @description
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    R memberCoupon();
}
