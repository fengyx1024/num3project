package com.shangma.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 10:09
 */
@Getter
@AllArgsConstructor
public enum PayTypeEnum {
    PAY_TO_DELIVERY(0,"货到付款"),
    ALIPAY(1,"支付宝支付"),
    WECHAT_PAY(2,"微信支付"),
    UNIONPAY(3,"银联");
    @EnumValue
    @JsonValue
    private Integer payType;

    private String description;

    @Override
    public String toString() {
        return getDescription();
    }
}
