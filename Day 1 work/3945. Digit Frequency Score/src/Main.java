class Solution {
    public int digitFrequencyScore(int n) {
        int[] fre = new int[10];
        while(n>0){
            int reminder = n%10;
            fre[reminder]++;
            n=n/10;
        }
        int ans =0;
        for(int i =0 ; i < 10;i++){
            ans=ans+(i*fre[i]);
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 122333;

        int result = sol.digitFrequencyScore(n);

        System.out.println("Digit Frequency Score = " + result);
    }
}