package ProblemSolving.M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P19_RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n;

        for(int i = 0; i < n; i++) {
            if(i < k) {
                // printing rightmost Kth elements
                System.out.print(arr[n + i - k] + " ");
            } else {
                // prints array after k elements
                System.out.print(arr[i - k] + " ");
            }
        }
        //System.out.println();
        sc.close();
    }
    
}
