package com.shangma.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @author fengyx
 * @TableName t_consignee
 * 收货人
 */
@Data
@EqualsAndHashCode(callSuper=true)
@TableName("t_consignee")
public class Consignee extends BaseEntity {


    private static final long serialVersionUID = -83184377926256871L;

    /**
     * 收货人姓名
     */
    private String consigneeName;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 联系手机
     */
    private String mobile;

    /**
     * 邮政编码
     */
    private String postalCode;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 配送地区
     */
    private Integer rigion;

    /**
     * 配送方式
     */
    private Integer distributionMode;

    /**
     * 配送费用
     */
    private BigDecimal distributionMoney;

    /**
     * 支付方式
     */
    private Integer payment;

    /**
     * 自提时间
     */
    private Date deliveryTime;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 汇款人
     */
    private String remitter;

    /**
     * 备注
     */
    private String remark;




}