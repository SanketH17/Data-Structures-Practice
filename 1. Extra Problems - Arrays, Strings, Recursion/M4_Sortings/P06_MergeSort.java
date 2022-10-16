package M4_Sortings;

import java.util.*;

public class P06_MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,9,6,3,7,4,8};
        int n = arr.length;
        int[] brr = new int[n]; //create a new empty array brr same size as arr
        mergeSort(arr, 0, n-1, brr);
        System.out.println(Arrays.toString(arr));
    }



    public static void mergeSort(int[] arr, int l, int r, int[] brr) {
        if(l < r) {
            int mid = (l + r) / 2;
            // [left..........mid]
            // [mid + 1...........r]

            mergeSort(arr, l, mid, brr); // [l..........mid] -> sorted

            mergeSort(arr, mid+1, r, brr); // [mid+1...........r] -> sorted
            
            merge(arr, l, mid, r, brr); // [l.........r] -> sorted
        }
        
    }


    public static void merge(int[] arr, int leftstart, int leftend, int rightend, int[] brr) {
        // [leftstart........leftend] ---> LEft sorted subarray
       //  [leftend+1.......rightend] ---> RIght sorted subarray

       int i = leftstart;
       int j = leftend + 1;
       int k = leftstart;

       while(i <= leftend && j <= rightend) {
           if(arr[i] <= arr[j]) {
               brr[k] = arr[i];
               i++;k++;
           } else {
               brr[k] = arr[j];
               j++;k++;
           }
       }

       while(i <= leftend) {
           brr[k] = arr[i];
           i++;k++;
       }
       while (j <= rightend) {
           brr[k] = arr[j];
           j++;k++;
       }

       // copy elements back to arr from brr
       for(int p = leftstart; p <= rightend; p++) {
           arr[p] = brr[p];
       }
   }

}
