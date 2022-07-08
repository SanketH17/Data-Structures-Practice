package M8_Dynamic_Programming;


/*

STORAGE & MEANING
It's fairly simple. We make an array for DP of the dimensions same as that of the maze i.e. n*m.

The meaning assigned to a single cell in this grid is that "to travel from that cell to the destination cell, 
what is the minimum cost to traverse out of all the paths".

DIRECTION
We always try to solve the question for a simpler and smaller problem via which we move on to the bigger problem.

We want you to meditate on the fact that to travel from the bottom right cell i.e. dp[n-1][m-1] to the the destination cell dp[n-1][m-1], 
the minimum cost of the path is the same as the cost of the cell corresponding 
to the input array (according to the "Meaning" we assigned for a single cell).

 */





/*
A number n
A number m
e11
e12..
e21
e22..
n * m number of elements
Output Format
The cost of least costly path.


Sample Input
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
Sample Output
23


 */

import java.util.*;
public class p06_MinimumCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] [] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];
/*****************************************************************************/

        for(int i = dp.length - 1; i >= 0; i--){
            for(int j = dp[0].length - 1; j >= 0; j--){
                if(i == dp.length - 1 && j == dp[0].length - 1){
                    dp[i][j] = arr[i][j];
                }
                else if(i == dp.length - 1){
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                }
                else if(j == dp[0].length - 1){
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) + arr[i][j];
                }
            }
        }

        System.out.println(dp[0][0]);

/******************************************************************************/        
        sc.close();
    }
}
