package M07_Time_and_Space_Complexity;



/*
5934
To separete each digit
4 ->  5934 / 1  &  5934 % 10
3 ->  5934 / 10 & 5934 % 10
9 ->  5934 / 100 & 5934 % 10
5 ->  5934 / 1000 & 5934 % 10

how many times do we need to run RadixSort ? (number of iterations)
ans : till all the digits of a largest number is finished

 */

import java.util.*;
public class p09_RadixSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        radixSort(arr);
        print(arr);
        sc.close();
    }


    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void radixSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int exp = 1;
        //call countSOrt for every digit from right to left
        while(exp <= max){
            countSort(arr, exp);
            exp = exp * 10;
        }
    }

    public static void countSort(int[] arr, int exp) {

        int[] ans = new int[arr.length];

        // make frequency arr
        int[] farr = new int[10];
        for (int i = 0; i < arr.length; i++) {
          farr[(arr[i] / exp) % 10]++;
        }

        // convert it into prefix sum array
        for (int i = 1; i < farr.length; i++) {
          farr[i] += farr[i - 1];
        }

        // stable sorting(filling ans array)
        for (int i = arr.length - 1; i >= 0; i--) {
          int pos = farr[(arr[i] / exp) % 10] - 1;
          ans[pos] = arr[i];
          farr[(arr[i] / exp) % 10]--;
        }

        // filling original array with the help of ans array
        for (int i = 0; i < arr.length; i++) {
          arr[i] = ans[i];
        }

        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
      }
    
}
