package com.tman.gulimall.product.dao;

import com.tman.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 18:45:41
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
