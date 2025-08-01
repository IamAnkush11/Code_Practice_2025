import java.util.*;
public class Methods {

    static int factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Enter no.");
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println("The factorial of "+no+ " is = " + factorial(no));
        sc.close();
        
    }
}
