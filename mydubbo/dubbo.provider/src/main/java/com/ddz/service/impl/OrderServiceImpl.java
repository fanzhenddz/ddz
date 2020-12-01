package com.ddz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ddz.entity.Order;
import com.ddz.entity.TbOrder;
import com.ddz.mapper.TbOrderMapper;
import com.ddz.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service(version = "1.0") // alibaa 的
public class OrderServiceImpl implements OrderService {
    private static List<Order> list = new ArrayList<>();
    @Autowired
    private TbOrderMapper tbOrderMapper;


    static {
        list.add(new Order(1, "订单1", 20.3, 1));
        list.add(new Order(2, "订单2", 20.3, 1));
        list.add(new Order(3, "订单3", 20.3, 1));
        list.add(new Order(4, "订单4", 20.3, 1));
    }

    @Override
    public List<Order> findOrderList() {
        return list;
    }

    @Override
    @HystrixCommand(fallbackMethod = "error")
    public List<TbOrder> findList(Map<String, Object> param) throws Exception {
        int num = (int) (Math.random()*10);
        System.out.println(num);
        if (num > 5) {
            throw new RuntimeException();
        }
        return tbOrderMapper.getTbOrderListByMap(param);
    }

    public List<TbOrder> error(Map<String, Object> param) throws Exception {
        List<TbOrder> list = new ArrayList<>();
        TbOrder tbOrder = new TbOrder();
        tbOrder.setUsername("熔断");
        list.add(tbOrder);
        return list;
    }

}
