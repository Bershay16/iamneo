package Array;
import java.util.HashMap;

public class Freq {
    public static void main(String[] args){
        int[] arr = {2,4,5,2,4,5,6,7,8,8,8,9,9};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        System.out.println("Frequency : ");
        for(var entry : hm.entrySet()){
            System.out.println(entry.getKey() + " -> "+entry.getValue());
        }
        System.out.println();
    }
}