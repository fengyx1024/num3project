package com.shangma;

import com.shangma.entity.OrderVO;
import com.shangma.mapper.OrderVoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 11:15
 */
@SpringBootTest
public class OrderVoMapperTest {
    @Autowired
    private OrderVoMapper orderVoMapper;

    @Test
    void test() {
        OrderVO orderVO = new OrderVO();
        orderVO.setId(1L);
        List<OrderVO> orderVOS = orderVoMapper.selectOrderVOs(orderVO);
        orderVOS.forEach(System.out::println);
    }
}
