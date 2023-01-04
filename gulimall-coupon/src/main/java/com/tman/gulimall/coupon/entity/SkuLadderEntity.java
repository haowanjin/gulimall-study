package com.tman.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商品阶梯价格
 *
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-04 22:11:42
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * spu_id
     */
    private Long skuId;
    /**
     * 满几件
     */
    private Integer fullCount;
    /**
     * 打几折
     */
    private BigDecimal discount;
    /**
     * 折后价
     */
    private BigDecimal price;
    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    private Integer addOther;

}
