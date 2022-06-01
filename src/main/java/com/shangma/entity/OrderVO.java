package com.shangma.entity;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonInclude;
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6
import com.shangma.enums.OrderActionEnum;
import com.shangma.enums.OrderStatusEnum;
import com.shangma.enums.OrderTypeEnum;
import com.shangma.enums.PayTypeEnum;
import lombok.Data;

<<<<<<< HEAD
=======
import java.time.LocalDateTime;

>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6
/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 10:31
 */
@Data
<<<<<<< HEAD
=======
@JsonInclude(JsonInclude.Include.NON_NULL)
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6
public class OrderVO {
    private Long id;
    /**
     * 订单类型
     */
<<<<<<< HEAD
    private OrderTypeEnum orderType;
=======
    private Integer orderType;
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6

    /**
     * 订单动作
     */
<<<<<<< HEAD
    private OrderActionEnum orderAction;
=======
    private Integer orderAction;
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6

    /**
     * 业务类型
     */
    private Integer businessType;

    /**
     * 支付方式
     */
<<<<<<< HEAD
    private PayTypeEnum payType;
=======
    private Integer payType;
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6

    /**
     * 配送方式
     */
    private Integer distributionMode;

    /**
     * 订单状态
     */
<<<<<<< HEAD
    private OrderStatusEnum orderStatus;
=======
    private Integer orderStatus;

    /**
     * 开始时间
     */
    private LocalDateTime startDate;

    /**
     * 结束时间
     */
    private LocalDateTime endDate;
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6
}
