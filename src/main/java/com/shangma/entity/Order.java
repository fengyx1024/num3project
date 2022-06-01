package com.shangma.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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