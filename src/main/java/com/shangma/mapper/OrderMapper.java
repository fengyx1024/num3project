package com.shangma.mapper;

import com.shangma.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Repository;
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6

/**
* @author JAVASM
* @description 针对表【t_order】的数据库操作Mapper
* @createDate 2022-05-31 22:15:10
* @Entity com.shangma.entity.Order
*/
<<<<<<< HEAD
public interface OrderMapper extends BaseMapper<Order> {

=======
@Repository
public interface OrderMapper extends BaseMapper<Order> {

    Order selectByIdWithItem(Long id);
>>>>>>> 132662a87fd1798695768446e78b5b668a2279e6
}




