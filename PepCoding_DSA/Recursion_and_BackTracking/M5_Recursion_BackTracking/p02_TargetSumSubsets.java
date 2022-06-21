package PepCoding_DSA.Recursion_and_BackTracking.M5_Recursion_BackTracking;


/*
input : 
5
10
20
30
40
50

70

output : 
 */

import java.util.*;

public class p02_TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, tar);
        sc.close();
    }

    /*
     set is the subset
     sos is sum of subset
     tar is target
     */
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        

        if(idx == arr.length){
            if(sos == tar){
                System.out.println(" " + set + " ");
            }
            return;
        }

        printTargetSumSubsets(arr, idx + 1, set + arr[idx], sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);

    }
}