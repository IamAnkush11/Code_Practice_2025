package com.MyCofeeMachine;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
public class CafeService {

    private final CoffeeMachine espressoMachine;
    private final CoffeeMachine latteMachine;

    @Autowired
    public CafeService(
            @Qualifier("espressoMachine") CoffeeMachine espressoMachine,
            @Qualifier("latteMachine") CoffeeMachine latteMachine) {
        this.espressoMachine = espressoMachine;
        this.latteMachine = latteMachine;
    }

    public void makeEspresso() {
        espressoMachine.brew();
    }

    public void makeLatte() {
        latteMachine.brew();
    }

    @PostConstruct
    public void init() {
        System.out.println("CafeService:  Ready to serve  drinks!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("CafeService:  Shutting down café service...");
    }
}




