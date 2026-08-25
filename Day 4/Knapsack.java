public class Knapsack {
    static int knapsack(int[] weight, int[] price, int capacity, int n) {
        if (n == 0 || capacity == 0)
            return 0;
        if (weight[n-1] > capacity)
            return knapsack(weight, price, capacity, n - 1);
        int take = price[n - 1] + knapsack(weight, price, capacity - weight[n - 1], n - 1);
        int notTake = knapsack(weight, price, capacity, n - 1);
        return Math.max(take, notTake);
    }
    public static void main(String[] args) {
        int[] weight = {1, 2, 3};
        int[] price = {10, 20, 30};
        int capacity = 5;
        System.out.println(knapsack(weight, price, capacity, weight.length));
    }
}