package com.shangma.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
<<<<<<< HEAD
import com.shangma.entity.Order;
import com.shangma.service.OrderService;
import com.shangma.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author JAVASM
* @description 针对表【t_order】的数据库操作Service实现
* @createDate 2022-05-31 22:15:10
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

=======
import com.shangma.entity.Consignee;
import com.shangma.entity.Order;
import com.shangma.mapper.ConsigneeMapper;
import com.shangma.service.OrderService;
import com.shangma.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JAVASM
 * @description 针对表【t_order】的数据库操作Service实现
 * @createDate 2022-05-31 22:15:10
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ConsigneeMapper consigneeMapper;

    @Override
    public Order getOrderDetails(Long id) {
        Order order = orderMapper.selectByIdWithItem(id);
        Consignee consignee = consigneeMapper.selectById(order.getConsigneeId());
        order.setConsignee(consignee);

        return order;
    }
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6
}




