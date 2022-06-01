package com.shangma.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 9:06
 */
@Getter
@AllArgsConstructor
public enum ResponseStatus {
    SUCCESS(2000, "成功"),
    FAIL(5000, "失败");


    /**
     * response code
     */
    private final Integer responseCode;

    /**
     * 信息
     */
    private final String message;
}
