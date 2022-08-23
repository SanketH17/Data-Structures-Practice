package ProblemSolving.M2_Loops_and_Arrays.Arrays;

import java.util.*;

public class p03_LargestAtLeastTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //
        int res = dominantIndex(arr);
        System.out.println(res);
        sc.close();
    }

    public static int dominantIndex(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            max = Math.max(i, max);
        }

        int pos = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                pos = i;
            }
            int twice = 2 * arr[i];
            if(twice > max && arr[i] != max) {
                return -1;
            }
        }
        return pos;


    }
}
