package M07_Time_and_Space_Complexity;




/*
input : 
10
4 9 2 8 6 3 15 63 25 50
output : 
2
4
9
6
8
3
15
63
25
50
 */

import java.util.*;
public class p05_MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int[] res = mergeSort(a, 0, a.length-1);
        print(res);
        sc.close();
    }
    public static int[] mergeSort(int[] arr, int low, int high) {
        if(low == high){
            int[] ba = new int[1];
            ba[0] = arr[low];
            return ba;
        }

        int mid = (low + high) / 2;
        int[] f = mergeSort(arr, low, mid);
        int[] s = mergeSort(arr, mid + 1, high);
        int[] fs = mergeTwoSortedArrays(f, s);
        return fs;
    }

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
                k++;
            }
            else{
                res[k] = b[j];
                j++;
                k++;
            }

            while(i < a.length){
                res[k] = a[i];
                i++;
                k++;
            }
            while(j < b.length){
                res[k] = b[j];
                j++;
                k++;
            }
        }

        return res;

    }

    

    public static void print(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
