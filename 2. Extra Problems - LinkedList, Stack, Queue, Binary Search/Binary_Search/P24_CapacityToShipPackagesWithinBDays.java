package Binary_Search;

import java.util.*;

public class P24_CapacityToShipPackagesWithinBDays {

    public static int shipWithinBDays(int[] wt, int days) {
        int max = 0;
        int sum = 0;

        for (int val : wt) {
            sum += val;
            max = Math.max(max, val);
        }

        if (wt.length == days) {
            return max;
        }

        int lo = max;
        int hi = sum;
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isPossible(wt, mid, days) == true) {
                ans = mid;
                hi = mid - 1; // reduce the wt
            } else {
                lo = mid + 1;
            }
        }
        return ans;

    }

    private static boolean isPossible(int[] wt, int mid, int days) {
        int d = 1;
        int sum = 0;
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

        int ans = shipWithinBDays(arr, days);
        System.out.println(ans);
        sc.close();
    }
}
