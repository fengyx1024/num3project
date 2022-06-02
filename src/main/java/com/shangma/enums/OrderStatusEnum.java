package com.shangma.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 10:21
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {
    PASSED(0,"审核通过"),
    SENT(1,"已出库"),
    SHIPPED(2,"已发货"),
    AOG(3,"已到货"),
    FILED(4,"已归档");
    @EnumValue
    @JsonValue
    private final Integer orderStatus;
    private final String description;

    @Override
    public String toString() {
        return getDescription();
    }
}
