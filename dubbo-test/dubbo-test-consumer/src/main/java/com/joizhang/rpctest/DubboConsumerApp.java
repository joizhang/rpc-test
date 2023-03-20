package com.joizhang.rpctest;

import com.joizhang.rpctest.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
@EnableDubbo
public class DubboConsumerApp {

    @DubboReference
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboConsumerApp.class, args);
        DubboConsumerApp application = context.getBean(DubboConsumerApp.class);
        String result = application.doSayHello("world");
        System.out.println("result: " + result);
    }

}
