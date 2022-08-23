package ProblemSolving.M4_Sortings;

import java.util.Arrays;

public class P05_TwoSortedSubArrays {
    public static void main(String[] args) {
        int[] arr = {8,10,13,0,1,2};
        int[] brr = new int[arr.length];
        merge(arr, 0, 2, 5, brr);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int leftstart, int leftend, int rightend, int[] brr) {
         // [leftstart........leftend]--->LEft sorted subarray
	    // [leftend+1.......rightend]---> RIght sorted subarray

        int i = leftstart;
        int j = leftend + 1;
        int k = leftstart;

        while(i <= leftend && j <= rightend) {
            if(arr[i] < arr[j]) {
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
        for(int p = leftstart; p < rightend; p++) {
            arr[p] = brr[p];
        }
    }
}










