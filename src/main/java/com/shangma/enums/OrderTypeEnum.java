package com.shangma.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 9:55
 */
@Getter
@AllArgsConstructor
public enum OrderTypeEnum {
    INNER(0,"内部订单"),
    MALL(1,"商城订单"),
    WAP(2,"wap订单"),
    PHONE(3,"电话订单"),
    AUCTION(4,"竞拍订单"),
    CART(5,"号卡订单"),
    SECKILL(6,"秒杀订单");

    /**
     * 类型
     */
    @EnumValue
    @JsonValue
    private final Integer orderType;

    /**
     * 描述
     */
    private final String description;

    @Override
    public String toString() {
        return getDescription();
    }

}
