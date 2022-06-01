package com.shangma.controller;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangma.entity.Order;
import com.shangma.entity.OrderVO;
import com.shangma.entity.response.ResponseEntity;
import com.shangma.enums.OrderStatusEnum;
import com.shangma.service.OrderService;
import com.shangma.service.OrderVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 11:42
 */
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderVoService orderVoService;

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<PageInfo<OrderVO>> findOrderVos(OrderVO orderVO, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrderVO> orderVos = orderVoService.findOrderVos(orderVO);
        PageInfo<OrderVO> pageInfo = new PageInfo<>(orderVos);
        return ResponseEntity.success(pageInfo);
    }

    @GetMapping("/{id}")
    public ResponseEntity findOrder(@PathVariable Long id) {
        Order order = orderService.getById(id);
        return order != null ? ResponseEntity.success(order) : ResponseEntity.fail();
    }

    @PutMapping
    public ResponseEntity<Void> updateOrder(Order order) {
        LambdaUpdateWrapper<Order> wrapper = new LambdaUpdateWrapper<>();
        OrderStatusEnum orderStatus = order.getOrderStatus();
        wrapper.set(orderStatus != null, Order::getOrderStatus, orderStatus);
        return orderService.update(order, wrapper) ? ResponseEntity.success() : ResponseEntity.fail();
    }
}
