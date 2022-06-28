
/*

You are given a number n, representing the count of elements.
You are given n numbers, representing n elements.
You are required to find the maximum sum of a subsequence with no adjacent elements.



Input :
6
5
10
10
100
5
6

Output :
116


 */

import java.util.*;

public class p17_MaxSum_NonAdjacentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int inc = arr[0];
        int exc = 0;
        for(int i = 1; i < arr.length; i++){
            int new_inc = exc + arr[i];
            int new_exc = Math.max(inc, exc);
            
            inc = new_inc;
            exc = new_exc;
        }
        int ans = Math.max(inc, exc);
        System.out.println(ans);

        sc.close();

    }
}

/*

Time Complexity :
O(n)

This time complexity is linear due to the use of for loop.

SPACE COMPLEXITY :
O(n)

As a 1D array is used to store the input numbers, hence a space of order n is required.

 */