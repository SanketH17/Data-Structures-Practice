package M2_BitManipulation;

import java.util.*;

public class P02_SingleNumber {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findSingleNumber(arr, n);
        System.out.println(ans);

        sc.close();
    }

    public static int findSingleNumber(int[] arr, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

}
