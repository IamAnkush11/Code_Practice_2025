package com.MyCofeeMachine;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("espressoMachine")
@Scope("singleton")
public class EspressoMachine implements CoffeeMachine {

    public EspressoMachine() {
        System.out.println("\n");
        System.out.println("EspressoMachine instance created");
    }

    @Override
    public void brew() {
        System.out.println("Brewing strong Espresso...");
    }

    @PostConstruct
    public void init() {
        System.out.println("EspressoMachine: @PostConstruct called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("EspressoMachine: @PreDestroy called");
    }
}

