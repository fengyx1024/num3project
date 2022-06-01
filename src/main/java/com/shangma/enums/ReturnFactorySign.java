package com.shangma.enums;

/**
 * 返厂出库标志枚举
 */
public enum ReturnFactorySign {

    out_ok(1,"已出库"),
    out_no(0,"未出库"),
    in_ok(1,"已入库"),
    in_no(0,"未入库");

    /**
     * 编号
     */
    private int code;
    /**
     * 信息
     */
    private String massage;



    ReturnFactorySign() {
    }

    ReturnFactorySign(int i, String str) {
    }

    public String getMassage() {
        return massage;
    }

    public int getCode() {
        return code;
    }
}
