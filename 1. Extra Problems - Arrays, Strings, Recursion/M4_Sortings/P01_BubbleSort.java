package M4_Sortings;

import java.util.*;

public class P01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 3, 2, 5};
        bubbleSort(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Array after pass number " + (i + 1)  + Arrays.toString(arr) +  "\n");
        }
        return;
    }

}






