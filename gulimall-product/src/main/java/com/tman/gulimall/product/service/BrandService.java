package com.tman.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tman.gulimall.common.utils.PageUtils;
import com.tman.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-05 00:23:01
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

