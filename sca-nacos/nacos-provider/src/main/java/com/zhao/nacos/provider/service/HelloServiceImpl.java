package com.zhao.nacos.provider.service;

import com.zhao.nacos.api.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello World"+name;
    }
}
