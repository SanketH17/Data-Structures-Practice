package M3_SlidingWindow;

import java.util.*;

public class P06_EquilibriumIndex {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findEquilibriumIndex(arr, n);
        System.out.println(ans);

        sc.close();
    }

    public static int findEquilibriumIndex(int[] arr, int n) {
        int sum = 0;
        int leftsum = 0;

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return -1;
        }
        // find sum of whole array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (leftsum == sum) {
                return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }
}
