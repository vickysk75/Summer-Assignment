class Solution {
    public boolean checkZeroOnes(String s) {
        int ones = 0;
        int zeros = 0;
        int max1 = 0;
        int max0 = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
                max1 = Math.max(max1, ones);
                zeros = 0;
            } else {
                zeros++;
                max0 = Math.max(max0, zeros);
                ones = 0;
            }
        }

        return max1 > max0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "110100010";

        boolean result = sol.checkZeroOnes(s);

        System.out.println("Result: " + result);
    }
}