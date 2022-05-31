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
 * @TableName t_order
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="t_order")
@Data
public class Order extends BaseEntity implements Serializable {
    /**
     * 订单编号
     */
    @TableId
    private Long id;

    /**
     * 订单类型
     */
    private Integer orderType;

    /**
     * 订单动作
     */
    private Integer orderAction;

    /**
     * 业务类型
     */
    private Integer businessType;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 收货人编号
     */
    private Long consigneeId;

}