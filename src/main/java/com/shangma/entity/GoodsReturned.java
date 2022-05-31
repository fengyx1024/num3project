package com.shangma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @TableName t_goods_returned
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="t_goods_returned")
@Data
public class GoodsReturned extends BaseEntity {


    private static final long serialVersionUID = 2047304788784240118L;
    /**
     * 物流编号
     */
    @TableId
    private Long id;

    /**
     * 订单编号
     */
    private Long orderId;

    /**
     * 
     */
    private Long createBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Long updateBy;

    /**
     * 
     */
    private Date updateTime;
    
}