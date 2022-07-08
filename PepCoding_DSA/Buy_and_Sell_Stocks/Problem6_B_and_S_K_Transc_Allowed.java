package Buy_and_Sell_Stocks;

/*
input :
6 // n
9 6 7 6 3 8 // array
3 // no of transactions

output :
6

 */

import java.util.*;

public class Problem6_B_and_S_K_Transc_Allowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // no of transactions

        int[][] dp = new int[k + 1][n];

        for(int t = 1; t <= k; t++){ // t = transactions
            int max = Integer.MIN_VALUE;

            for(int d = 1; d < arr.length; d++){ // days
                if(dp[t - 1][d - 1] - arr[d - 1] > max){
                    max = dp[t - 1][d - 1] - arr[d - 1];
                }
                
                if(max + arr[d] > dp[t][d - 1]){
                    dp[t][d] = max + arr[d];
                }
                else{
                    dp[t][d] = dp[t][d - 1];
                }
            }
        }

        System.out.println(dp[k][n - 1]);

        sc.close();

    }
}
 








/****************** O(n^3) Solution******************************************************

public class Problem6_B_and_S_K_Transc_Allowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[][] dp = new int[k + 1][n];

        for(int t = 1; t <= k; t++){ // t = transactions
            for(int d = 1; d < arr.length; d++){ // days
                int max = dp[t][d - 1];

                for(int pd = 0; pd < d; pd++){ // pd - past day
                    int ptilltm1 = dp[t - 1][pd]; // profit till t - 1
                    int ptth = arr[d] - arr[pd]; // profit till t th

                    if(ptilltm1 + ptth > max){
                        max = ptilltm1 + ptth;
                    }
                }

                dp[t][d] = max;
            }
        }

        System.out.println(dp[k][n - 1]);

        sc.close();

    }
}

 */