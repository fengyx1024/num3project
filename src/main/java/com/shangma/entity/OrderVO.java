package com.shangma.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.shangma.enums.*;
import lombok.Data;

import java.time.LocalDateTime;


/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 10:31
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private BusinessTypeEnum businessType;

    /**
     * 支付方式
     */
    private PayTypeEnum payment;

    /**
     * 配送方式
     */
    private DistributionMode distributionMode;

    /**
     * 订单状态
     */
    private OrderStatusEnum orderStatus;

    /**
     * 开始时间
     */
    private LocalDateTime startDate;

    /**
     * 结束时间
     */
    private LocalDateTime endDate;

    /**
     * 下单日期
     */
    private LocalDateTime createTime;
}
