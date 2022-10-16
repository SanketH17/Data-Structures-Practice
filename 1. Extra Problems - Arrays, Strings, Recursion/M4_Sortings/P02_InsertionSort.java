package M4_Sortings;

import java.util.Arrays;

public class P02_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 15, 17, 5, 10, 11};
        insertionSort(arr);
        System.out.println("\n " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // first element is already sorted so i will start from 1
        for(int i = 1; i < n; i++) {

            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
            
            System.out.println("\n Array after pass number " + i + " -> " + Arrays.toString(arr));
        }
    }
}
