package com.shangma.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
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
    INNER(1,"内部订单"),
    MALL(2,"商城订单"),
    WAP(3,"wap订单"),
    PHONE(4,"电话订单"),
    AUCTION(5,"竞拍订单"),
    CART(6,"号卡订单"),
    SECKILL(7,"秒杀订单");

    /**
     * 类型
     */
    @EnumValue
    private final Integer orderType;

    /**
     * 描述
     */
    private final String description;

}
