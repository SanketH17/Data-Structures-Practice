package M8_Dynamic_Programming;


/*

Sample Input
4
1 5 7
5 8 4
3 2 9
1 2 4
Sample Output
8

 */

import java.util.*;

public class p18_PaintHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // no of houses(in rows)
        long[][] houses = new long[n][3];
        for(int i = 0; i < houses.length; i++){
            for(int j = 0; j < houses[0].length; j++){
                houses[i][j] = sc.nextInt();
            }
        }


        long[][] dp = new long[n][3];
        dp[0][0] = houses[0][0];
        dp[0][1] = houses[0][1];
        dp[0][2] = houses[0][2];

        for(int i = 1; i < houses.length; i++){
            
            dp[i][0] = houses[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = houses[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = houses[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);

        }

        long ans = Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
        System.out.println(ans);
        sc.close();

    }
}

/*
Time Complexity :
O(n2)

This time complexity is quadratic because of the use of nested for loop.

SPACE COMPLEXITY :
O(n2)

As an extra space is required for a 2D dynamic programming array, therefore space complexity is quadratic.
 */