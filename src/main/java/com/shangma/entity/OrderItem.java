package com.shangma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @author JAVASM
 * @TableName t_order_item
 */

@TableName(value ="t_order_item")
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderItem extends BaseEntity {


    private static final long serialVersionUID = 2266306107874242944L;
    /**
     * 订单详情id
     */
    @TableId
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 商品数量
     */
    private Integer productNum;

    /**
     * 总金额
     */
    private BigDecimal total;

    /**
     * 
     */
    private Long createBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private Long updateBy;

}