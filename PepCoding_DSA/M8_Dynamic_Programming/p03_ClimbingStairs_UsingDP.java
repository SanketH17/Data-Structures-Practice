package M8_Dynamic_Programming;


import java.util.*;
public class p03_ClimbingStairs_UsingDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countPathsTab(n);
        System.out.println(cp);
        sc.close();
    }

    public static int countPathsTab(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i - 1];
            }else if(i == 2){
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            else{
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i-3];
            }
        }
        return dp[n];
    }
}
/*

Time Complexity :
O(n)

Clearly, we are performing a loop of n iterations, and each iteration we are performing O(1) operations hence overall O(n).

This problem is very similar to Fibonacci except for the fact that we are using the last 3 instead of the last 2 in the case of Fibonacci.

SPACE COMPLEXITY :
O(n)

We are using a single array of size n+1 hence the space complexity is linear in nature. i.e O(n)

 */


/*

Simple recursion program : 


    public static int countPaths(int n) {
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        System.out.println("Hello " + n);
        int nm1 = countPaths(n - 1);
        int nm2 = countPaths(n - 2);
        int nm3 = countPaths(n - 3);
        int cp = nm1 + nm2 + nm3;
        return cp;
    }


    Recursion using memoization

    public static int countPaths(int n, int[] qb) {
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        if(qb[n] > 0){
            return qb[n];
        }

        System.out.println("Hello " + n);
        int nm1 = countPaths(n - 1, qb);
        int nm2 = countPaths(n - 2, qb);
        int nm3 = countPaths(n - 3, qb);
        int cp = nm1 + nm2 + nm3;

        qb[n] = cp;

        return cp;
    }






 */
