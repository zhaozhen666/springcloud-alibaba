package com.zhao.sca.nacos.consumer.controller;

import com.zhao.nacos.api.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference
    private IHelloService helloService;
    @GetMapping("say")
    public String sayHello(){
        return helloService.sayHello("zhaozhen");
    }
}
