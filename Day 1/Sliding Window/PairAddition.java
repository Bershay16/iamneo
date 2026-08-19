public class PairAddition {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int k = 2;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        System.out.println(sum);

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            System.out.println(sum);
        }
    }
}