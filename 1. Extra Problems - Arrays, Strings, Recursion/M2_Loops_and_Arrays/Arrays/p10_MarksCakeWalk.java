package ProblemSolving.M2_Loops_and_Arrays.Arrays;

import java.util.*;

public class p10_MarksCakeWalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int wf = 1;
        int ans = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            ans = ans + (arr[i] * wf);
            wf = wf * 2;
        }
        System.out.println(ans);
        sc.close();

    }
}







