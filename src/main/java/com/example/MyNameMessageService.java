package com.example;



public class MyNameMessageService implements MessageService {
    private String name = "Bartosz Preweda";

    @Override
    public String getMessage() {
        return this.name;
    }


}
