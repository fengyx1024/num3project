package com.shangma.common.axios;

public enum AxiosStatus {
    OK(20000,"success"),
    ERROGR(50000,"error")
    ;

    private int status;
    private String message;

    AxiosStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMassage() {
        return message;
    }
}
