package com.lin.validation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: ValidationProvider
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/6/22 17:26
 */
public class ValidationProvider {
    public static void main(String[] args) throws Exception {
        new EmbeddedZooKeeper(2181, false).start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/validation-provider.xml"});
        context.start();
        System.in.read();
    }
}
