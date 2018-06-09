package com.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: SpringDubboConsumerApplication
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/5/27 14:12
 */
@SpringBootApplication
public class SpringDubboConsumerApplication{
    public static void main(String[] args) {
        SpringApplication.run(SpringDubboConsumerApplication.class, args);
        System.out.println("服务消费者启动完毕！");
    }

}
