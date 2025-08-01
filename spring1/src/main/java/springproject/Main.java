package springproject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Programmer programmer1 = (Programmer)context.getBean("programmerLaptop");
        
        programmer1.code();
        programmer1.coderId();

        Programmer programmer2 = (Programmer)context.getBean("programmerDesktop");
        
        programmer2.code();
        programmer2.coderId();
    }
}