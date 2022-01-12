package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageServiceConfig.class);


        MessageService messageService = context.getBean(MyNameMessageService.class);
        MessageService randomMessageService = context.getBean(RandomTextMessageService.class);


        System.out.println(messageService.getMessage());
        System.out.println(randomMessageService.getMessage());


        System.out.println(messageService.hashCode());
        System.out.println(randomMessageService.hashCode());

        context.close();

    }
}
