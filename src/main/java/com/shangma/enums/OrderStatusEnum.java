package com.shangma.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
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
    PASSED(1,"审核通过"),
    SENT(2,"已出库"),
    SHIPPED(3,"已发货"),
    AOG(4,"已到货"),
    FILED(5,"已归档");
    @EnumValue
    private final Integer orderStatus;
    private final String description;
}
