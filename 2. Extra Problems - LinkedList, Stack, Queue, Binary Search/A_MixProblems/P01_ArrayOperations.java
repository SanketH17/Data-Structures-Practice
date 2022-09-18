package A_MixProblems;

import java.util.*;

public class P01_ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 1. sum
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // 2. Average
        int avg = sum / n;

        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }

        System.out.println(sum + " " + avg + " " + max);
        sc.close();
    }
}
