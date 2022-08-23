

import java.util.Arrays;

public class P03_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        
        if(start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

}
