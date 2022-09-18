package A_MixProblems;

import java.util.*;

public class P02_IndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String ans = findIndex(arr, k);
        System.out.println(ans);

        sc.close();

    }

    public static String findIndex(int[] arr, int k) {
        String ans = "";
        String ans1 = "-1";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                ans = ans + (i + 1) + " ";
            }
        }

        if (ans.length() != 0) {
            return ans;
        } else {
            return ans1;
        }

    }
}
