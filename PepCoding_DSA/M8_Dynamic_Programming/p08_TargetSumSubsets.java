package M8_Dynamic_Programming;


/*

SUBSETS : we can take any element in subsets from the array.

SUBARRAY : subarrays are always in a contiguous fashion.

Sample input :
5
4 2 3 1 7
10
Sample output :
true

 */
import java.util.*;
public class p08_TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        
        boolean[][] dp = new boolean[n + 1][tar + 1];

/***************************************************************************************/      

        for(int i = 0; i < dp.length; i++){ // iterating over arr i.e. rows
            for(int j = 0; j < dp[0].length; j++){ // iterating over cols i.e. target 
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }
                else if( i == 0){
                    dp[i][j] = false; 
                }
                else if(j == 0){
                    dp[i][j] = true;
                }
                else{
                    if(dp[i - 1][j] == true){
                        dp[i][j] = true;
                    }
                    else{
                        int val = arr[i - 1];
                        if(j >= val){
                            if(dp[i - 1][j - val] == true){
                                dp[i][j] = true;
                            }
                        }
                    }
                }

            }
        }

        System.out.println(dp[arr.length][tar]);
/***************************************************************************************/
        sc.close();
    }
}


/*
Time Complexity :
Since we are running two nested loops, one from 1 to n, inner loop from 1 to target, hence the time complexity will be 
O(n * target).

This problem was a NP-Complete Problem. The value of the target does not depend on the number of elements n.

SPACE COMPLEXITY :
Since we used a 2D DP array of size (n + 1) * (target + 1), hence there is 
O(n * target) auxiliary space required.


 */