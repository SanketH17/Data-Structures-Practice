package Binary_Search;

import java.util.*;

public class P24_CapacityToShipPackagesWithinBDays {

    public static long shipWithinBDays(int[] wt, int days) {
        int max = 0;
        long sum = 0;

        for (int val : wt) {
            sum += val;
            max = Math.max(max, val);
        }

        if (wt.length == days) {
            return max;
        }

        long lo = max;
        long hi = sum;
        long ans = 0;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            if (isPossible(wt, mid, days) == true) {
                ans = mid;
                hi = mid - 1; // reduce the wt
            } else {
                lo = mid + 1;
            }
        }
        return ans;

    }

    private static boolean isPossible(int[] wt, long mid, int days) {
        int d = 1;
        long sum = 0;
        for (int i = 0; i < wt.length; i++) {
            sum += wt[i];

            if (sum > mid) {
                d++;
                sum = wt[i];
            }
        }
        return d <= days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int days = sc.nextInt();

        
        System.out.println(shipWithinBDays(arr, days));
        sc.close();
    }
}