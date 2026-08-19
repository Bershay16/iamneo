public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {20, 4, 5, 2, 40, 5, 6, 7, 8, 8, 8, 9, 9};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > num) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = num;
        }
        System.out.println("Sorted Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}