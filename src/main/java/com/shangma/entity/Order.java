package com.shangma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.shangma.enums.BusinessTypeEnum;
import com.shangma.enums.OrderActionEnum;
import com.shangma.enums.OrderStatusEnum;
import com.shangma.enums.OrderTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @TableName t_order
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="t_order")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order extends BaseEntity implements Serializable {

    /**
     * 订单类型
     */
    private OrderTypeEnum orderType;

    /**
     * 订单动作
     */
    private OrderActionEnum orderAction;

    /**
     * 业务类型
     */
    private BusinessTypeEnum businessType;

    /**
     * 订单状态
     */
    private OrderStatusEnum orderStatus;

    /**
     * 收货人编号
     */
    private Long consigneeId;

    /**
     * 是否为网店订单 1 yes 0 no
     */
    private Integer isOnlineStore;

    /**
     * 网店类型 1淘宝 2当当
     */
    private Integer storeType;

    /**
     * 收货人信息
     */
    private Consignee consignee;

    /**
     * 订单项
     */
    private List<OrderItem> orderItems;
}