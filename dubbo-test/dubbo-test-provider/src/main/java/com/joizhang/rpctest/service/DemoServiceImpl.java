package com.joizhang.rpctest.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

@DubboService
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {
        System.out.println("Hello " + name + ", request from consumer: " +
                RpcContext.getServerContext().getRemoteAddress());
        return "Hello " + name;
    }
}
