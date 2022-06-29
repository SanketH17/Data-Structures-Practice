
import java.util.*;

public class p24_PartitionIntoSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // total no of people
        int k = sc.nextInt(); // // group of k teams to be formed
        
        sc.close();

        if(n == 0 || k == 0 || n < k){
            System.out.println(0);
            return;
        }

        long[][] dp = new long[k + 1][n + 1];

        for(int t = 1; t <= k; t++){ // teams
            for(int p = 1; p <= n; p++){ // people
                if(p < t){
                    dp[t][p] = 0;
                }
                else if(p == t){
                    dp[t][p] = 1;
                }
                else{
                    dp[t][p] = dp[t - 1][p - 1] + dp[t][p - 1] * t;
                }
            }
        }

        System.out.println(dp[k][n]);
        

    }
}


/*

Time Complexity:
Simple two loops are running. The outer loop is k times. The inner loop is n times. Hence the time complexity is O(k*n).

Space Complexity:
We are using a 2D grid of size n*k. Hence the space complexity is also O(n*k).

 */

 