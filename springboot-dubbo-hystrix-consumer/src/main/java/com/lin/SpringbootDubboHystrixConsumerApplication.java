package com.lin;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.lin.service.ProviderService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;


@SpringBootApplication
@Service
@EnableHystrix
public class SpringbootDubboHystrixConsumerApplication{

	@Reference(version = "1.0.0")
	private ProviderService providerService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootDubboHystrixConsumerApplication.class, args);
		SpringbootDubboHystrixConsumerApplication application = context.getBean(SpringbootDubboHystrixConsumerApplication.class);

		String result = application.sayHello("Jack");
		System.out.println("result :"+result);
	}

	@HystrixCommand(fallbackMethod = "reliable")
	public String sayHello(String name){
		return providerService.sayHello(name);
	}


	public String reliable(String name){
		return "hystrix fallback value";
	}
}
