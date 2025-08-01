package com.springboot1.springBoot1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
// injected computer beans
    @Autowired
    private List<Computer> computers;

    public void code() {
        for (Computer computer : computers) {
            computer.compile();
        }
    }

// Here, implementing specific beans is also possible
    //  @Autowired
    // private Laptop laptop;

    // @Autowired
    // private Desktop desktop;

    // public void code() {
    //     laptop.compile();
    //     desktop.compile();
    // }
}
