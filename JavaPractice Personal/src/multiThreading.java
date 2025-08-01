// Impelments using runnable interface

class Coding implements Runnable{
    
    public void run(){
         for(int i=1;i<=5;i++){
            System.out.println("Coding");

        }
    }
}

class Chatting implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Chatting");

        }

    }
}

public class multiThreading {
// Implments using runnable interface
    public static void main(String[] args) {
        // first creating a task
        Coding mycode=new Coding();
        // then implementing thred
        Thread t1= new Thread(mycode);
        // now calling start methods
       
        Chatting mychat=new Chatting();
        Thread t2= new Thread(mychat);

        t1.start();
        t2.start();
        

    }

    
}
