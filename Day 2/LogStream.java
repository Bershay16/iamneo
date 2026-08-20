import java.util.*;

public class LogStream {
    public static void main(String[] args){
        String log = "BACDGABCDA";
        String keyword = "ABCD";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<keyword.length();i++){
            map.put(keyword.charAt(i),map.getOrDefault(keyword.charAt(i),0)+1);
        }
        int n = log.length(),count=-1;
        int[] result = new int[n];
        int left=0,right=0;
        for(int i=0;i<n;i++){}
    }
}
