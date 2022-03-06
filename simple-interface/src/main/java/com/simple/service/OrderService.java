package com.simple.service;

import com.simple.entity.UserAddress;

import java.util.List;

/**
 * 项目: dubbo-study
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-06 11:11
 **/
public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
