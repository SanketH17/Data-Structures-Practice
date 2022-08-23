package ProblemSolving.M1_Conditionals;

import java.util.*;

public class p09_OddArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // calculating the add elements sum
        int oddsum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddsum += arr[i];
            }
        }

        System.out.println(oddsum);
    }
}
