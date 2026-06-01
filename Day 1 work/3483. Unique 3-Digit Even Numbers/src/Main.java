class Solution {
    public int totalNumbers(int[] nums) {

        if (nums.length < 3) return -1;

        int[] fre = new int[10];

        for (int i : nums) {
            fre[i]++;
        }

        int count = 0;

        for (int i = 1; i <= 9; i++) {
            if (fre[i] == 0) continue;
            fre[i]--;

            for (int j = 0; j <= 9; j++) {
                if (fre[j] == 0) continue;
                fre[j]--;

                for (int k = 0; k <= 8; k += 2) {
                    if (fre[k] == 0) continue;

                    int num = i * 100 + j * 10 + k;
                    count++;
                }

                fre[j]++;
            }

            fre[i]++;
        }

        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {2, 1, 3, 0};

        int result = sol.totalNumbers(nums);

        System.out.println("Total valid 3-digit even numbers: " + result);
    }
}