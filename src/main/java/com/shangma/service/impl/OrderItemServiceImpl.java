package com.shangma.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shangma.entity.OrderItem;
import com.shangma.service.OrderItemService;
import com.shangma.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author JAVASM
* @description 针对表【t_order_item】的数据库操作Service实现
* @createDate 2022-05-31 22:16:26
*/
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService{

}




