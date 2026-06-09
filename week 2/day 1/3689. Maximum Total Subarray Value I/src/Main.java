class Solution {

    public long maxTotalValue(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return 1L * k * (max - min);
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 3, 7, 2, 9};
        int k = 5;

        long ans = obj.maxTotalValue(nums, k);

        System.out.println("Answer = " + ans);
    }
}