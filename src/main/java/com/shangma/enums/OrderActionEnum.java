package com.shangma.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 订单动作
 * @author: fengyx
 * @date: 2022/6/1 10:21
 */
@Getter
@AllArgsConstructor
public enum OrderActionEnum {

    ORDER(1,"订购"),
    SWAP(2,"换购"),
    PAY(3,"支付");

    private final Integer orderAction;

    private final String description;
}