package com.lin;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDubboConsumer2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboConsumer2Application.class, args);
		System.out.println("服务消费者2启动完毕！");
	}
}
