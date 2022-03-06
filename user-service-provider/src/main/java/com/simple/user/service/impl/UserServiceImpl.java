package com.simple.user.service.impl;

import com.simple.entity.UserAddress;
import com.simple.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 项目: dubbo-study
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-06 14:16
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "浙江省杭州市西湖区1", "1", "wuxxx", "15679105833", "Y");
        UserAddress address2 = new UserAddress(2, "浙江省杭州市余杭区", "2", "zxxx", "15979105833", "Y");
        return Arrays.asList(address1, address2);
    }
}
