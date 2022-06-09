package PepCoding_DSA.Functions_and_Arrays;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        RotateArray(arr, k);
        display(arr);

        sc.close();
    }

    public static void reverse(int[] a, int li, int ri) {
        while (li < ri) {
          int temp = a[li];
          a[li] = a[ri];
          a[ri] = temp;
    
          li++;
          ri--;
        }
      }

    public static void RotateArray(int[] a, int k) {
        k = k % a.length;
        if(k < 0){
            k = k + a.length;
        }
        //part 1 - 0 to a.length - k - 1
        reverse(a, 0, a.length - k - 1);
        //part 2 -> a.length - k to a.length - 1
        reverse(a, a.length - k, a.length - 1);
        //part 3 -> 0 to a.length
        reverse(a, 0, a.length - 1);

    }

    public static void display(int[] a) {
        for(int val : a)
            System.out.print(val + " ");
    }

}
