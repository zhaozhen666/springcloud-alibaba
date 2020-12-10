package com.zhao.sca;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@DubboComponentScan
@SpringBootApplication
public class ConsumerApplication {

//    @Reference(url = "dubbo://127.0.0.1:20881/com.zhao.sca.IHelloService")
//    private IHelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

//    @Bean
//    public ApplicationRunner runner(){
//        return args -> System.out.println(helloService.sayHello("zhaozhen"));
//    }
}
