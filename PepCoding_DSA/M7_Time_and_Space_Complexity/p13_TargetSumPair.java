package PepCoding_DSA.M7_Time_and_Space_Complexity;

import java.util.*;
public class p13_TargetSumPair {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }

    targetSumPair(arr, 0, arr.length - 1);
}
