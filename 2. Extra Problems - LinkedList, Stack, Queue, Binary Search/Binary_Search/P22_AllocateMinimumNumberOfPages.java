package Binary_Search;

import java.util.*;

public class P22_AllocateMinimumNumberOfPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt(); // Number of students to allocate pages in which maximum pages allocated is
                              // minimum

        int ans = minPages(arr, m);

        System.out.println(ans);

        sc.close();

    }

    public static int minPages(int[] arr, int m) {
        int sum = 0;
        int max = 0;

        // finding max in array and sum of all elements
        for (int val : arr) {
            sum = sum + val;
            max = Math.max(max, val);
        }

        // lowest possible ans for the maximum pages to be minimum is max of array
        int lo = max;
        int hi = sum;
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // by keeping this mid(no of pages) as a maximum load, is it possible to
            // distribute the books among m students
            if (isPossible(arr, mid, m) == true) {
                ans = mid;
                hi = mid - 1; // decrease the load and search for better ans
            } else { // increase the load by moving lo to mid + 1
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int mid, int m) {
        int st = 1; // no of students initially 1
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > mid) {
                st++;
                sum = arr[i];
            }
        }

        // at the end we are checking -
        // the number of students that we need are
        // less or equal to m (given no of students)
        return st <= m;
    }
}