package com.zhao.sca.impl;

import com.zhao.sca.IHelloService;

public class MockService implements IHelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("降级情况");
        return "服务无法访问,请稍后重试";
    }
}
