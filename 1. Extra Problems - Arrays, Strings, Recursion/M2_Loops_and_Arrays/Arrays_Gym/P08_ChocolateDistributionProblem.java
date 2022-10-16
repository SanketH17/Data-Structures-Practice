package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P08_ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no of packets
        int m = sc.nextInt(); // no of students
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = find(arr, n, m);
        System.out.println(ans);
        sc.close();
    }

    public static int find(int[] arr, int n, int m) {

        if (m == 0 || n == 0)
            return 0;

        int ans = Integer.MAX_VALUE;

        Arrays.sort(arr);

        if (n < m)
            return -1;
        if(n == m) {
            int gap = arr[m - 1] - arr[0];
            return gap;
        }

        for(int i = 0; i < n - m; i++) {
            int minw = arr[i];
            int maxw = arr[i + m - 1];
            int gap = maxw - minw;

            if(gap < ans) {
                ans = gap;
            }
        }
        return ans;
    }
}
