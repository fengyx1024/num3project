package com.shangma.entity;

import com.shangma.enums.OrderActionEnum;
import com.shangma.enums.OrderStatusEnum;
import com.shangma.enums.OrderTypeEnum;
import com.shangma.enums.PayTypeEnum;
import lombok.Data;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 10:31
 */
@Data
public class OrderVO {
    private Long id;
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
    private Integer businessType;

    /**
     * 支付方式
     */
    private PayTypeEnum payType;

    /**
     * 配送方式
     */
    private Integer distributionMode;

    /**
     * 订单状态
     */
    private OrderStatusEnum orderStatus;
}
