package com.tman.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tman.gulimall.common.utils.PageUtils;
import com.tman.gulimall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:11:42
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

