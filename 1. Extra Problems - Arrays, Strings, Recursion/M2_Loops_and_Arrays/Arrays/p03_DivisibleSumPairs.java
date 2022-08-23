package ProblemSolving.M2_Loops_and_Arrays.Arrays;

import java.util.*;

public class p03_DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //counting sums which are divisible by k
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if((arr[i] + arr[j]) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();

    }
}
