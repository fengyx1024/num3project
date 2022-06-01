package com.shangma.service;

import com.shangma.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shangma.entity.OrderVO;

import java.util.List;

/**
* @author JAVASM
* @description 针对表【t_order】的数据库操作Service
* @createDate 2022-05-31 22:15:10
*/
public interface OrderService extends IService<Order> {

    Order getOrderDetails(Long id);
}
