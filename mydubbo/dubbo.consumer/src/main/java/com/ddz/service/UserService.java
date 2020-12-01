package com.ddz.service;

import com.ddz.entity.Order;
import com.ddz.entity.TbOrder;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<Order> getOrders();

    List<TbOrder> findList(Map<String, Object> param) throws Exception;
}
