package PepCoding_DSA.M7_Time_and_Space_Complexity;


import java.util.*;
//import java.math.*;

public class p10_SortDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            String str = sc.next();
            arr[i] = str;
        }

        sortDates(arr);
        print(arr);
        sc.close();
    }

    public static void print(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void sortDates(String[] arr){

        countSort(arr, 1000000, 100, 32); // 1 to 31 will be the values for the days
        countSort(arr, 10000, 100, 13);
        countSort(arr, 1, 10000, 2501);
    }

    public static void countSort(String[] arr, int div, int mod, int range){

        String[] ans = new String[arr.length];// ans array length will be same as the input array length
        int[] farr = new int[range];

        for(int i = 0; i < arr.length; i++){
            farr[Integer.parseInt(arr[i], 10) / div % mod]++;
        }

        //convert farr to prefix sum array
        for(int i = 1; i < farr.length; i++){
            farr[i] += farr[i - 1];
        }

        //stable sorting(filling an ans array)
        for(int i = arr.length; i >= 0; i--){
            int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
            ans[pos] = arr[i];
            farr[Integer.parseInt(arr[i], 10) / div % mod]--;
        }

        //filling original array with the help of ans array
        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }

    }

}
