import java.util.HashSet;
import java.util.ArrayList;

public class hashSetDupli {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>(6);
        l.add(6);
        l.add(1);
        l.add(15);
        l.add(112);
        l.add(7);
        l.add(3);
        HashSet<Integer> s=new HashSet<>();

        for(int i: l){
            s.add(i);
        }

        l.clear();

        for(int elem: s){
            l.add(elem);
        }

        for(int x : l){
            System.out.println(x);
        }
    }
}
