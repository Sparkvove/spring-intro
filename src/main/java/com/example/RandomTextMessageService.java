package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService  implements MessageService{
    private String[] Messages = {"Message 1","Message 2","Message 3","Message 4","Message 5","Message 6","Message 7","Message 8","Message 9","Message 10"};
    @Override
    public String getMessage() {
        int rnd = (int) (Math.random() * ((9) + 1));
        return this.Messages[rnd];
    }



}
