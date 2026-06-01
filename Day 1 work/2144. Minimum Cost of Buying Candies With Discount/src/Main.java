import java.util.Arrays;
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n =  cost.length-1;
        int count = 0;
        int ans  = 0 ;
        for(int i = n ;  i >=0 ; i--){
            if(count==2){
                count =0;
                continue;
            }
            ans += cost[i];
            count++;
        }
        return ans ;

    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] cost = {6, 5, 7, 9, 2, 2};

        int result = sol.minimumCost(cost);

        System.out.println("Minimum Cost = " + result);
    }
}