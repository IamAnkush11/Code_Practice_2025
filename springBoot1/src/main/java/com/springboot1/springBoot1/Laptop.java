package com.springboot1.springBoot1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    @Override
   public void compile() {
        System.out.println("Compiling code using Laptop...");
    }
}
