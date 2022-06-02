package com.shangma.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shangma.entity.OrderVO;

import java.util.List;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 10:54
 */

public interface OrderVoMapper extends BaseMapper<OrderVO> {
    List<OrderVO> selectOrderVOs(OrderVO orderVO);

}
