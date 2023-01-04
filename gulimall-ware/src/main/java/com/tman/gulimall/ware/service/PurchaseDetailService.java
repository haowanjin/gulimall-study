package com.tman.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tman.gulimall.common.utils.PageUtils;
import com.tman.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:09:47
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

