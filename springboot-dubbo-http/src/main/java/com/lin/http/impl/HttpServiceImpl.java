package com.lin.http.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.lin.http.api.HttpService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Title: HttpServiceImpl
 * @Description:
 * @author: youqing
 * @version: 1.
 * @date: 2018/6/22 10:31
 */
public class HttpServiceImpl implements HttpService{
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext
                .getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
