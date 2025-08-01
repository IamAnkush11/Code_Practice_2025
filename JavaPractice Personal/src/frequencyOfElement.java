import java.util.HashMap;



public class frequencyOfElement{
    public static void main(String[] args){

        int[] arr= {2,4,4,4,3,4,3,3};

        HashMap <Integer,Integer> m= new HashMap<>();

        for(int i=0;i<8;i++){
            // this says if map has value then use it else use 0 to avoid null value
            int cnt = m.getOrDefault(arr[i], 0) + 1;
            m.put(arr[i],cnt);
        }

        for(int key : m.keySet()){
            System.out.println(key + " ->" + m.get(key));
        }
    }
}
