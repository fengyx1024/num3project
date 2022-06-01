package com.shangma.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 业务类型
 * @author: fengyx
 * @date: 2022/6/1 10:19
 */
@Getter
@AllArgsConstructor
public enum BusinessTypeEnum {

    GENERAL(1,"普通业务"),
    SET_MEAL(2,"号卡套餐");

    @EnumValue
    private final Integer businessType;

    private final String description;
}
