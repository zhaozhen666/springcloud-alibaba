package com.zhao.sca.impl;

import com.zhao.sca.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService(cluster = "failover", loadbalance = "roundrobin")
public class HelloServiceImpl implements IHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;
    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String sayHello(String name) {
        System.out.println(port + "被调用了");
        return "Hello" + serviceName + name;
    }
}
