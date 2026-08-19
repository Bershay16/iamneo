public class MoveZerosRight {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}