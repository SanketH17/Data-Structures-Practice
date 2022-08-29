package Stack_Problems;

import java.util.*;
import java.util.Stack;

/*
Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. Since the answer may be large, print the answer modulo 10^9 + 7.
Input:

The first line contains a single integer n(size of the array) The second line contains n space integers that denote the elements of the array
Output:

print the sum of minimum of all subarrays
Constraints

1 <= arr.length <= 3 * 10^4
1 <= arr[i] <= 3 * 10^4

Sample Input 1

4
3 1 2 4

*/


public class P08_SumofSubarrayMinimums {

    static class Pair {
        int val;
        int count;

        public Pair(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }

    public static int sumSubarrayMins(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Stack<Pair> left = new Stack<>();
        int[] leftArr = new int[arr.length];

        Stack<Pair> right = new Stack<>();
        int[] rightArr = new int[arr.length];

        // finding the frequency of arr[i] when it was min when
        // it was the ending point of any subarry
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (!left.isEmpty() && arr[i] < left.peek().val) {
                count += left.pop().count;
            }
            left.push(new Pair(arr[i], count));
            leftArr[i] = count;
        }

        // finding the frequency of arr[i] when it was min when
        // it was begining of the subarray
        for (int i = arr.length - 1; i >= 0; i--) {
            int count = 1;
            while (!right.isEmpty() && arr[i] <= right.peek().val) {
                count = count + right.pop().count;
            }
            right.push(new Pair(arr[i], count));
            rightArr[i] = count;
        }

        long res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] * leftArr[i] * rightArr[i];
            res = res % 1000000007;
        }
        return (int)res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = sumSubarrayMins(arr);
        System.out.println(ans);

        sc.close();
    }
}
