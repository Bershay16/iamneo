public class LongestConsecutiveSubstring {
    public static void main(String[] args) {
        String s = "aaabbccccdde";

        int max = 1, count = 1, end = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
                end = i;
            }
        }

        System.out.println(s.substring(end - max + 1, end + 1));
    }
}