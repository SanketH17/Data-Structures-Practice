package PepCoding_DSA.Recursion_and_BackTracking.M2_Recursion_In_Arrays;

import java.util.Scanner;

public class p4_first_index_of_occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int fi = firstIndex(arr, 0, d);
        System.out.println(fi);

        sc.close();
    }

    public static int firstIndex(int[] arr, int index, int x){
        // x is data 

        if(index == arr.length){
            return -1;
        }

        
        if(arr[index] == x){
            return index;
        }
        else{
            int fiisa = firstIndex(arr, index + 1, x); // fiisa = first index in smaller array
            return fiisa;
        }

    }


}
