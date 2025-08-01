package springproject;

import java.util.UUID;

public class Programmer {
    private String id;

    // This constructor initializes a unique ID for each Programmer object when it is created.
    // It uses UUID to generate a random unique identifier
    public Programmer() {
        this.id = UUID.randomUUID().toString(); // Unique ID per object
    }

    // This is a reference to the Computer class, which will be injected by Spring through xml file in Programmer class.
    // It allows the Programmer to use the Computer class methods which is implemented
         // by laptop class and desktop class.
    private Computer computer;

    // Setter for Laptop
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    // Getter for Laptop
    // public Laptop getLaptop() {
    //     return this.laptop;
    // }

    // // Constructor for Laptop injection
    //  Programmer(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    public void code() {
        System.out.println("Hi, I am Programmer");
    }

    public void coderId() {
        System.out.println("Coder ID: " + this.id);
        // laptop object is used to compile the code
        computer.compile();
        
    }
}

