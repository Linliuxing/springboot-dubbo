package com.lin.http;

import com.lin.http.api.HttpService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: HttpConsumer
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/6/22 10:42
 */
public class HttpConsumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/http-consumer.xml"});
        context.start();
        HttpService httpService = (HttpService) context.getBean("httpService");
        String result = httpService.sayHello("world");
        System.out.println(result);
        System.in.read();
    }
}
