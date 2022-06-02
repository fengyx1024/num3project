package com.shangma.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/2 14:04
 */
@Getter
@AllArgsConstructor
public enum DistributionMode {
    EMS(0,"EMS"),
    OTHER(1,"其他");

    @EnumValue
    @JsonValue
    private final Integer code;

    private final String description;

    @Override
    public String toString() {
        return getDescription();
    }
}
