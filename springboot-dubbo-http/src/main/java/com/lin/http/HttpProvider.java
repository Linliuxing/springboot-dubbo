package com.lin.http;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: HttpProvider
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/6/22 10:44
 */
public class HttpProvider {
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/http-provider.xml"});
        context.start();
        System.in.read();
    }
}
