package com.simple.order.service.impl;

import com.simple.entity.UserAddress;
import com.simple.service.OrderService;
import com.simple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目: dubbo-study
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-06 14:27
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
        return null;
    }
}
