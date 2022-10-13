package M5_Recursion;

import java.util.*;

public class P05_HelloRecursion {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Case " + k + ": " + solve(0, a));
        }

        sc.close();
    }

    public static int solve(int i, int[] a) {
        if (i == a.length) {
            return 0;
        }
        return a[i] + solve(i + 1, a);
    }

}
