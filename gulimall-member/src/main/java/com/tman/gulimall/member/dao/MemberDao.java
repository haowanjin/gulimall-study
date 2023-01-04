package com.tman.gulimall.member.dao;

import com.tman.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:07:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
