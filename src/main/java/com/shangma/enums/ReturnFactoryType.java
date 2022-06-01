package com.shangma.enums;

public enum ReturnFactoryType {
    //1:维修  2：更换
    exchange(2,"更换"),
    repair(1,"维修")
    ;

    private int code;
    private String messgae;

    ReturnFactoryType() {
    }

    ReturnFactoryType(int code, String messgae) {

        this.code = code;
        this.messgae = messgae;
    }

    public int getCode() {
        return code;
    }

    public String getMessgae() {
        return messgae;
    }
}
