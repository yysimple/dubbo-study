package com.simple.service;

import com.simple.entity.UserAddress;

import java.util.List;

/**
 * 项目: dubbo-study
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-06 11:10
 **/
public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
