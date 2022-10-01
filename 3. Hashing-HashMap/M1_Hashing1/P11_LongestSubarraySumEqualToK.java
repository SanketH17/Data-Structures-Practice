package M1_Hashing1;

import java.util.*;

/*
Sample Input :
6 15
10 5 2 7 1 9
Sample Output :
4
*/

public class P11_LongestSubarraySumEqualToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lenOfLongSubarr(arr, n, target));

        sc.close();
    }

    static int lenOfLongSubarr(int[] arr, int n, int k) {
        // HashMap to store (sum, index) tuples
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        // traverse the given array
        for (int i = 0; i < n; i++) {

            // accumulate sum
            sum += arr[i];

            // when subarray starts from index '0'
            if (sum == k)
                maxLen = i + 1;

            // make an entry for 'sum' if it is not present in 'map'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // check if 'sum-k' is present in 'map' or not
            if (map.containsKey(sum - k)) {
                // update maxLength
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }

        return maxLen;
    }

}





