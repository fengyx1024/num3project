package com.shangma.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;

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

    ORDER(0,"订购"),
    SWAP(1,"换购"),
    PAY(2,"支付");


    private final Integer orderAction;

    private final String description;
}
