package com.shangma.enums;

/**
 * 审核状态枚举类
 */
public enum AuditStatus {
    //0未通过1已通过2未审批3未入库4已入库
    no(0,"未通过"),
    ok(1,"已通过"),
    wait(2,"未审批"),
    out(3,"未入库"),
    in(4,"已入库")
    ;
    /**
     * 编号
     */
    private int code;
    /**
     * 描述
     */
    private String massage;

    AuditStatus() {
    }

    AuditStatus(int code, String massage) {
        this.code = code;
        this.massage = massage;
    }

    public int getCode() {
        return code;
    }

    public String getMassage() {
        return massage;
    }
}
