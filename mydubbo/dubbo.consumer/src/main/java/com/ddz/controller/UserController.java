package com.ddz.controller;

import com.ddz.entity.Order;
import com.ddz.entity.TbOrder;
import com.ddz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getOrders")
    public List<Order> getOrders() {
        return userService.getOrders();
    }

    @GetMapping("/getList")
    public List<TbOrder> getList(Map<String, Object> param) throws Exception {
        return userService.findList(param);
    }
}
