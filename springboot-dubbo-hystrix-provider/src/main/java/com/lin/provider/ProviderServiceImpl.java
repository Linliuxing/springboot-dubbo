package com.lin.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lin.service.ProviderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

/**
 * @Title: ProviderServiceImpl
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/8/11 9:44
 */
@Service(version = "1.0.0")
@Component
public class ProviderServiceImpl implements ProviderService {

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
    @Override
    public String sayHello(String name) {
        //return "Hello "+name;
        throw new RuntimeException("Exception to show hystrix enabled.");
    }

}
