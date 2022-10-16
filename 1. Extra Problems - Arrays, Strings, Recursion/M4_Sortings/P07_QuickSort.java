package M4_Sortings;

import java.util.Arrays;

public class P07_QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 6, 3, 9, 23, 65};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l, int r) {
        if(l < r) {
            int pIndex = partition(arr, l, r); // arr, left, right
            quickSort(arr, l, pIndex - 1); // arr left, pindex - 1
            quickSort(arr, pIndex + 1, r); // pindex + 1, right
        }
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int i = l;
        int j = r;

        while(i < j) {
            // search till element not found which is greater than pivot
            while(i <= r && arr[i] <= pivot){
                i++;
            }

            // search till element not found which is less pivot
            while(arr[j] > pivot) {
                j--;
            }

            // swap elements at ith and jth position
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;

    }

}
