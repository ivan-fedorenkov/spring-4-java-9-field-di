package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        BeanParent parent = context.getBean(BeanParent.class);
        System.out.println(parent.getChild().getNumber());
    }
}
