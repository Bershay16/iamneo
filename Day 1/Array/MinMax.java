package Array;
public class MinMax {
    public static void main(String[] args){
        int[] arr = {2,4,5,2,4,5,6,7,8,8,8,9,9};
        int min = arr[0], max = arr[0];
        for(int num : arr){
            if(num > max) max = num;
            else if(num<= min) min = num;
        }
        System.out.println("Minimum : "+min);
        System.out.println("Maximum : "+max);
        System.out.println();
    }
}
