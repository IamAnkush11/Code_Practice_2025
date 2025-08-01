class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    
    
        @Override 
        void makeSound() {
            super.makeSound();            
            System.out.println("Dog barks");  
        
    }
}

public class Overriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  
                         
    }
}
