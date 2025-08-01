package com.MyCofeeMachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
 
 
@SpringBootApplication
 
public class CofeeMachineApplication {
 
    public static void main(String[] args) {
        //SpringApplication.run(CofeeMachineApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
            CafeService cafe = context.getBean(CafeService.class);

            cafe.makeEspresso();
            cafe.makeLatte();

            context.close();
 
 
 
 
       
    }
 
 
 
   
}
