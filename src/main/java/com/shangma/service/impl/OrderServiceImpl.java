package com.shangma.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}




