package com.shangma.controller;

import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangma.entity.Order;
import com.shangma.entity.OrderVO;
import com.shangma.entity.response.ReturnEntity;
import com.shangma.service.OrderService;
import com.shangma.service.OrderVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
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
    public ReturnEntity<PageInfo<OrderVO>> findOrderVos(OrderVO orderVO, @RequestParam(name = "pageNum",defaultValue = "1") int pageNum, @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrderVO> orderVos = orderVoService.findOrderVos(orderVO);
        PageInfo<OrderVO> pageInfo = new PageInfo<>(orderVos);
        return ReturnEntity.success(pageInfo);
    }

    @GetMapping("/{id}")
    public ReturnEntity findOrder(@PathVariable Long id) {
        Order order = orderService.getOrderDetails(id);
        return order != null ? ReturnEntity.success(order) : ReturnEntity.fail();
    }

    @PutMapping
    public ReturnEntity<Void> updateOrder(@RequestBody Order order) {
        order.setUpdateTime(LocalDateTime.now());
        return orderService.updateById(order) ? ReturnEntity.success() : ReturnEntity.fail();
    }

    @GetMapping("orderWriteExcel")
    public ResponseEntity<byte[]> orderWriteExcel(OrderVO orderVO) throws UnsupportedEncodingException {
        List<OrderVO> orderVos = orderVoService.findOrderVos(orderVO);

        // 通过工具类创建writer
        ExcelWriter writer = ExcelUtil.getWriter(true);
        //自定义标题别名
        writer.addHeaderAlias("id", "订单编号");
        writer.addHeaderAlias("orderType", "订单类型");
        writer.addHeaderAlias("payment", "支付方式");
        writer.addHeaderAlias("businessType", "业务类型");
        writer.addHeaderAlias("createTime", "下单日期");
        writer.addHeaderAlias("orderAction", "订单动作");
        writer.addHeaderAlias("orderStatus", "订单状态");

        // 默认的，未添加alias的属性也会写出，如果想只写出加了别名的字段，可以调用此方法排除之
        writer.setOnlyAlias(true);
        // 合并单元格后的标题行，使用默认标题样式
        writer.merge(6, "销售订单表");
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(orderVos, true);
        // 设置响应头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", URLEncoder.encode("销售订单表.xlsx","utf-8"));
        // 写入到内存中
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        writer.flush(stream);
        // 获取字节数组
        byte[] bytes = stream.toByteArray();
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes,headers, HttpStatus.OK);
        IoUtil.close(stream);
        writer.close();
        return responseEntity;
    }
}
