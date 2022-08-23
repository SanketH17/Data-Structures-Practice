package ProblemSolving.M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P18_CheckSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean ans = true;
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] != arr1[i]) {
                ans = false;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
