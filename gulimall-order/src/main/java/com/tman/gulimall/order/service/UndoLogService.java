package com.tman.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tman.gulimall.common.utils.PageUtils;
import com.tman.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:05:12
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

