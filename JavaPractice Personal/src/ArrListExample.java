import java.util.ArrayList;
import java.util.Collections;

public class ArrListExample{
    public static void main(String[] args){
        ArrayList <Integer> l1= new ArrayList<>();
            l1.add(6);
            l1.add(4);
            l1.add(3);

        ArrayList <Integer> l2= new ArrayList<>(Collections.nCopies(4,9));

        l1.addAll(1,l2);

            for(int elem: l1){
                System.out.print(elem +" ");
            }
    }
}
