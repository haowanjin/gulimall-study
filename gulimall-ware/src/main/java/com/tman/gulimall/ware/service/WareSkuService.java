package com.tman.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tman.gulimall.common.utils.PageUtils;
import com.tman.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:09:47
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

