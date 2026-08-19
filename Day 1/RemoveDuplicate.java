import java.util.*;

public class RemoveDuplicate
{
	public static void main(String[] args) {
		int[] arr = {2,4,5,2,4,5,6,7,8,8,8,9,9};
		Set<Integer> hs = new HashSet<>();
		for(int num : arr) {
            hs.add(num);
		}
		System.out.println("No Duplicates");
		for(Integer num : hs){
		    System.out.print(num + " ");
		}
        System.out.println();
        System.out.println();
	}
}