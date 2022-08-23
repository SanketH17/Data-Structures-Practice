package ProblemSolving.M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class p04_LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printleaders(arr, n);
        sc.close();
    }

    public static void printleaders(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == n) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
    
}








