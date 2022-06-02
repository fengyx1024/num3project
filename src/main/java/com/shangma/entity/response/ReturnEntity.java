package com.shangma.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.shangma.enums.ResponseStatus;
import lombok.Data;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 9:09
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReturnEntity<T> {
    private Integer responseCode;

    private String message;

    private T data;

    private ReturnEntity(ResponseStatus responseStatus, T data) {
        this.responseCode = responseStatus.getResponseCode();
        this.message = responseStatus.getMessage();
        this.data = data;
    }

    private static <T> ReturnEntity<T> getInstance(ResponseStatus responseStatus, T data) {
        return new ReturnEntity<>(responseStatus, data);
    }

    public static <T> ReturnEntity<T> success(T data) {
        return getInstance(ResponseStatus.SUCCESS, data);
    }

    public static <T> ReturnEntity<T> success(ResponseStatus responseStatus, T data) {
        return getInstance(responseStatus, data);
    }

    public static <T> ReturnEntity<T> success(ResponseStatus responseStatus) {
        return getInstance(ResponseStatus.SUCCESS, null);
    }

    public static <T> ReturnEntity<T> success() {
        return getInstance(ResponseStatus.SUCCESS, null);
    }

    public static ReturnEntity<Void> fail(ResponseStatus responseStatus) {
        return getInstance(responseStatus, null);
    }

    public static ReturnEntity<Void> fail() {
        return getInstance(ResponseStatus.FAIL, null);
    }
}
