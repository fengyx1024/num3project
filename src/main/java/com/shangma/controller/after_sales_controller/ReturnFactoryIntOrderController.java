package com.shangma.controller.after_sales_controller;

import com.shangma.entity.ReturnFactoryIntOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ReturnFactoryIntOrder")
public class ReturnFactoryIntOrderController {
    @Autowired
    private ReturnFactoryIntOrder returnFactoryIntOrder;




}
