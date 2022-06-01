package com.shangma.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/5/31 22:00
 */
@Data
public class BaseEntity implements Serializable {


    private static final long serialVersionUID = -8532525247784456904L;

    private Long id;

    /**
     *
     */
    private Long createBy;

    /**
     *
     */
    private LocalDateTime createTime;

    /**
     *
     */
    private Long updateBy;

    /**
     *
     */
    private LocalDateTime updateTime;
}
