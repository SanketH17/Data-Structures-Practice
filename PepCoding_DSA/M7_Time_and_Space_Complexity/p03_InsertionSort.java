package PepCoding_DSA.M7_Time_and_Space_Complexity;

import java.util.*;

public class p03_InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr);
        print(arr); // printing the array

        sc.close();
    }

    //12 31 25 8 32 17 -> assume oth element is already sorted
    public static void InsertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(isGreater(arr, j, j+1) == true){ // if arr[j] is greater than arr[j+1] then swap 
                    swap(arr, j, j+1);
                    print(arr);
                }
            }
        }
    }

    public static boolean isGreater(int[] arr, int i, int j) { //comparing arr[j] and arr[j+1] if arr[j+1] is < arr[j] then return true and then swap both the elements
        System.out.println("Comparing " + arr[i] + " & " + arr[j] + "\n");
        if(arr[j] < arr[i]){
            return true;
        }
        else{
            return false;
        }
    }


    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " & " + arr[j] + "\n");
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
