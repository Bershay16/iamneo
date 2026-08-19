import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Nminmax {
    public static void main(String[] args){
        int[] arr = {2,4,5,2,4,5,6,7,8,8,8,9,9,5,4,2,7,8,1};
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        System.out.println();
        if (n < 1 || n > arr.length) {
            System.out.println("N must be between 1 and " + arr.length);
            sc.close();
            return;
        }
        for(int num : arr){
            min.add(num);
            max.add(num);
        }
        for(int i=0;i<n;i++){
            if(i == (n-1)){
                System.out.println(n+"th Minimum : "+min.peek());
                System.out.println(n+"th Maximum : "+max.peek());
                System.out.println();
            }else{
                min.remove();
                max.remove();
            }
        }
        sc.close();
    }
}
