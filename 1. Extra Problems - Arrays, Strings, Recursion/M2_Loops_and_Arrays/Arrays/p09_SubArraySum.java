package ProblemSolving.M2_Loops_and_Arrays.Arrays;

import java.util.*;

public class p09_SubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int l = 0; l < n; l++) {
            for(int r = l; r < n; r++) {
                long sum = 0;
                for(int i = l; i <= r; i++) {
                    sum += arr[i];
                }
                if(sum % k == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
