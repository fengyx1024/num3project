package com.shangma.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.shangma.enums.OrderActionEnum;
import com.shangma.enums.OrderStatusEnum;
import com.shangma.enums.OrderTypeEnum;
import com.shangma.enums.PayTypeEnum;
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
     * 支付方式
     */
    private Integer payment;

    /**
     * 配送方式
     */
    private Integer distributionMode;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 开始时间
     */
    private LocalDateTime startDate;

    /**
     * 结束时间
     */
    private LocalDateTime endDate;
}
