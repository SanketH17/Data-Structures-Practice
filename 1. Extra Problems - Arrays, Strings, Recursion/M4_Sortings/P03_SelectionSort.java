package ProblemSolving.M4_Sortings;

import java.util.Arrays;

public class P03_SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 29, 72, 98, 13, 87, 66, 52, 51, 36 };
        selectionSort(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // find min element and its index in entire array
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println("\n" + Arrays.toString(arr));
        }
    }
}
