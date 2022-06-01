package com.shangma.service;

import com.shangma.entity.OrderVO;

import java.util.List;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 11:40
 */
public interface OrderVoService {
    List<OrderVO> findOrderVos(OrderVO orderVO);
}
