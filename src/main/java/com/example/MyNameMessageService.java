package com.example;

import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    private String name = "Bartosz Preweda";
    @Override
    public String getMessage() {
        return this.name;
    }


}
