class MyException{
    public static int divides(int a, int b){
        try{
                    return a/b;

        }
        catch(Exception e){
            System.out.println("Encounter with an Exception" + e);
        }
        finally{
            System.out.println("This is final statement and always executed");
        }
        System.out.println("last Statement");


        return 0;
    }
}

public class ExceptionHandle{
    public static void main(String[] args){
       int result= MyException.divides(6,0);
       System.out.println(result);
    }
}
