package com.simple.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 项目: dubbo-study
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-06 14:32
 **/
public class UserApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        System.in.read();
    }
}
