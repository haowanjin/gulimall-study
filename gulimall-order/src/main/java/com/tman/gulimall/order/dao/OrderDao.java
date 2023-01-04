package com.tman.gulimall.order.dao;

import com.tman.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:05:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
