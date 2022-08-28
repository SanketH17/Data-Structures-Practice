package Binary_Search;

import java.util.*;

public class P23_KevinAndHisFruits {

    public static int getMaxMarker(int[] arr, int n, int m) {
        int MIN = 9999999;
        int MAX = 0;

        for (int i = 0; i < n; i++) {
            MIN = Math.min(MIN, arr[i]);
            MAX = Math.max(MAX, arr[i]);
        }
        int left = 0;
        int right = MAX;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    count += (arr[i] - mid);
                }
            }

            if (count == m) {
                return mid;
            }

            // Kevin need to eat more fruit so we will try for better ans 
            else if (count < m) {
                right = mid - 1;
            }

            else {
                idx = mid;
                left = mid + 1;
            }

        }
        return idx;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt(); // max fruits kevin can eat
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getMaxMarker(arr, n, m));
        sc.close();
    }
}
