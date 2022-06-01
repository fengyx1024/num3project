package com.shangma.controller.after_sales_controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.shangma.common.axios.AxiosReseult;
import com.shangma.entity.ReturnFactoryIntOrder;
import com.shangma.service.ReturnFactoryIntOrderService;
import com.shangma.service.impl.ReturnFactoryIntOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 返厂入库
 */
@RestController
@RequestMapping("FactoryInt")
public class ReturnFactoryIntOrderController {
    @Autowired
    private ReturnFactoryIntOrderService returnFactoryIntOrderService;

    /**
     * 新增入库单
     * @return
     */
    @GetMapping("addOrder")
    public AxiosReseult addOrder(@RequestBody ReturnFactoryIntOrder returnFactoryIntOrder){
        boolean save = returnFactoryIntOrderService.save(returnFactoryIntOrder);
        return save ? AxiosReseult.success() : AxiosReseult.error();
    }

    /**
     * 根据ID查询一个
     * @param id
     * @return
     */
    @GetMapping("selectById")
    public AxiosReseult selectById(Long id){
        ReturnFactoryIntOrder byId = returnFactoryIntOrderService.getById(id);
        return byId!=null ? AxiosReseult.success(byId) : AxiosReseult.error();
    }

    @PostMapping("updateById")
    public AxiosReseult updateById(@RequestBody ReturnFactoryIntOrder returnFactoryIntOrder){
        boolean b = returnFactoryIntOrderService.updateById(returnFactoryIntOrder);
        return b ? AxiosReseult.success() : AxiosReseult.error();
    }



}
