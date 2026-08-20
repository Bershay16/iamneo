class EqualZerosAndOnes {
    public static void main(String[] args) {

        int n = 8;
        int[] nums = {0, 1, 0, 1, 1, 1, 0, 0};

        int length = 0;

        for (int left = 0; left < n; left++) {

            int zero = 0;
            int one = 0;

            for (int right = left; right < n; right++) {

                if (nums[right] == 0)
                    zero++;
                else
                    one++;

                if (zero == one) {
                    length = Math.max(length, right - left + 1);
                }
            }
        }

        System.out.println("Longest length = " + length);
    }
}