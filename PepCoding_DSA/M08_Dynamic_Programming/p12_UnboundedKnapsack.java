package M08_Dynamic_Programming;


/*


Key difference from 0-1 Knapsack and Unbounded knapsack is in
Unbounded knapsack we can take one weight multiple times 


Sample input :
5
15 14 10 45 30
2 5 1 3 4
7

Sample output :
100

 */

import java.util.*;

public class p12_UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vals = new int[n];
        for(int i = 0; i < vals.length; i++){
            vals[i] = sc.nextInt();
        }

        int[] wts = new int[n];
        for(int i = 0; i < wts.length; i++){
            wts[i] = sc.nextInt();
        }

        int cap = sc.nextInt();

        int[] dp = new int[cap + 1];
        dp[0] = 0;

        for(int bagc = 1; bagc < dp.length; bagc++){
            int max = 0;
            for(int i = 0; i < n; i++){ // iterating over wts-val
                if(wts[i] <= bagc){
                    int rbagc = bagc - wts[i]; // remaining bag capacity
                    int rbagv = dp[rbagc]; // remaining bag value
                    int tbagv = rbagv + vals[i];

                    if(tbagv > max){
                        max = tbagv;
                    }
                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[cap]);

        sc.close();
    }
}
