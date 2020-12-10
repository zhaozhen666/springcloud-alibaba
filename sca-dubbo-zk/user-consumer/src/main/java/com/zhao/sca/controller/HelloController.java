package com.zhao.sca.controller;

import com.zhao.sca.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @DubboReference(mock = "com.zhao.sca.impl.MockService", cluster = "failfast")
    IHelloService helloService;

    @RequestMapping("/say")
    public String sayHello() {
        return helloService.sayHello("zhaozhen");
    }
}
