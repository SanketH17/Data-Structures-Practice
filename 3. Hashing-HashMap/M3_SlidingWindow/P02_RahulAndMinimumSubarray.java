package M3_SlidingWindow;

import java.util.*;

/*

find the length of the smallest subarray(subarray is a contiguous 
part of an array/list) in a given array/list ‘ARR’ of size ‘N’ 
with its sum greater than a given value. 
If there is no such subarray return 0.

Example: Given an ‘ARR’: [1, 2, 21, 7, 6, 12] and a number ‘X’: 23. 
The length of the smallest subarray is 2 as the subarray is [21, 7]

*/

public class P02_RahulAndMinimumSubarray {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findMinLengthSubArray(arr, n, target);
        System.out.println(ans);

        sc.close();
    }

    public static int findMinLengthSubArray(int[] arr, int n, int target) {
        int si = 0, ei = 0, sum = 0, minLength = Integer.MAX_VALUE;
        while (ei < n) {
            sum += arr[ei];
            ei++;
            while (sum > target) {
                minLength = Math.min(minLength, ei - si);
                sum -= arr[si];
                si++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
