
/*

Three steps of tabulation 
1. Storage and Memory
2. Direction
3. Travel and solve


In this problem :
in tabulation array we store the no of ways in ith position to reach the destination position





1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.




Input Format :
A number n
n more elements

Output Format :
A number representing the number of ways to climb the stairs from 0 to top.




Input : 
10
3
3
0
2
1
2
4
2
0
0
Output :
5
 */

import java.util.*;
public class p04_ClimbStairsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring an array which is telling how many no of ways we can go from ith position to the destinatio
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        } 

        int[] dp = new int[n + 1]; // 0 to 6
        dp[n] = 1; // n = 6 :> dp[6] = 1

        for(int i = n - 1; i >= 0; i--){
            for(int j = 1; j <= arr[i] && i + j < dp.length; j++){
                dp[i] = dp[i] + dp[i + j];
            }
        }

        System.out.println(dp[0]);
        sc.close();
    }
}

/*

Time Complexity :
O(n2)

Here we are running to loops. Outerloop runs n times and the inner loop can run n times in the worst case. And within the inner loop, we are just adding hence we will get constant time. So it's O(n*n) = O(n2).
SPACE COMPLEXITY :
O(n)

Here we are just using one dp[] array of length n+1, to store the results. Thus the space complexity will be O(n+1) = O(n)

 */