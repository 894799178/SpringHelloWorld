package com.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
        ApplicationContext applicationContext1  = new ClassPathXmlApplicationContext("ApplicationConifg-propreties.xml");
        User user = (User) applicationContext.getBean("user1");
        user.Hello();
        user = (User) applicationContext.getBean("user2");
        user.Hello();
        user = (User) applicationContext.getBean("user3");
        user.Hello();
        user = (User) applicationContext1.getBean("user");
        user.Hello();

    }
}
