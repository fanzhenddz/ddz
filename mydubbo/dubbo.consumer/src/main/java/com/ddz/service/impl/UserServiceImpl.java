package com.ddz.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ddz.entity.Order;
import com.ddz.entity.TbOrder;
import com.ddz.service.OrderService;
import com.ddz.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    // 开启负载均衡模式
    @Reference(version = "1.0", loadbalance = "roundrobin")
    //(check = false,retries = 5) // check--不监测服务提供端   retries--超时重试次数
    private OrderService orderService;

    @Override
    public List<Order> getOrders() {
        return orderService.findOrderList();
    }

    @Override
//    @HystrixCommand(fallbackMethod = "error")
    public List<TbOrder> findList(Map<String, Object> param) throws Exception {
        return orderService.findList(param);
    }

    public List<TbOrder> error(Map<String, Object> param) throws Exception {
        List<TbOrder> list = new ArrayList<>();
        TbOrder tbOrder = new TbOrder();
        tbOrder.setUsername("熔断11");
        return list;
    }
}
