package com.shangma.entity.response;

import com.shangma.enums.ResponseStatus;
import lombok.Data;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 9:09
 */
@Data
public class ResponseEntity<T> {
    private Integer responseCode;

    private String message;

    private T data;

    private ResponseEntity(ResponseStatus responseStatus, T data) {
        this.responseCode = responseStatus.getResponseCode();
        this.message = responseStatus.getMessage();
        this.data = data;
    }

    private static <T> ResponseEntity<T> getInstance(ResponseStatus responseStatus, T data) {
        return new ResponseEntity<>(responseStatus, data);
    }

    public static <T> ResponseEntity<T> success(T data) {
        return getInstance(ResponseStatus.SUCCESS, data);
    }

    public static <T> ResponseEntity<T> success(ResponseStatus responseStatus, T data) {
        return getInstance(responseStatus, data);
    }

    public static <T> ResponseEntity<T> success(ResponseStatus responseStatus) {
        return getInstance(ResponseStatus.SUCCESS, null);
    }

    public static <T> ResponseEntity<T> success() {
        return getInstance(ResponseStatus.SUCCESS, null);
    }

    public static ResponseEntity<Void> fail(ResponseStatus responseStatus) {
        return getInstance(responseStatus, null);
    }

    public static ResponseEntity<Void> fail() {
        return getInstance(ResponseStatus.FAIL, null);
    }
}
