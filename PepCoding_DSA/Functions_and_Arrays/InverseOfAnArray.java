package PepCoding_DSA.Functions_and_Arrays;

import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        InverseArray(arr);
        display(arr);
        sc.close();
    }

    public static int[] InverseArray(int[] arr){
        int[] inv = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int v = arr[i];
            inv[v] = i;
        }

        return inv;
    }

    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
