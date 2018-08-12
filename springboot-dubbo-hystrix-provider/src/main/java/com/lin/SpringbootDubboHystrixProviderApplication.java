package com.lin;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableDubbo
public class SpringbootDubboHystrixProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboHystrixProviderApplication.class, args);
		System.out.println("服务提供者启动完毕！");
	}
}
