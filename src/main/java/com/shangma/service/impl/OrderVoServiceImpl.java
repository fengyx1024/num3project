package com.shangma.service.impl;

import com.shangma.entity.OrderVO;
import com.shangma.mapper.OrderVoMapper;
import com.shangma.service.OrderVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 11:40
 */
@Service
public class OrderVoServiceImpl implements OrderVoService {
    @Autowired
    private OrderVoMapper orderVoMapper;
    @Override
    public List<OrderVO> findOrderVos(OrderVO orderVO) {
        return orderVoMapper.selectOrderVOs(orderVO);
    }
}
