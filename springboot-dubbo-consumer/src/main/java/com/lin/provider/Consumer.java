package com.lin.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lin.service.ProviderService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/5/19.
 */
@RestController
public class Consumer   {

    // 使用兼容注入，可以使用dubbo原生注解@Reference注入
    @Reference(version = "1.0.0")
    public ProviderService service;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name){
        return service.sayHello(name);
    }
}
