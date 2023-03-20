package com.joizhang.rpctest;

import lombok.SneakyThrows;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubbo
public class DubboProviderApp {

    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApp.class, args);
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }

}
