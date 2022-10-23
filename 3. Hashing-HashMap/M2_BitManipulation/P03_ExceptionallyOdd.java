package M2_BitManipulation;

import java.util.*;

public class P03_ExceptionallyOdd {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findExceptionallyOdd(arr, n);
        System.out.println(ans);

        sc.close();
    }

    public static int findExceptionallyOdd(int[] arr, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

}