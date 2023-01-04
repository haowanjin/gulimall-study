package com.tman.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tman.gulimall.common.utils.PageUtils;
import com.tman.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:11:41
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

