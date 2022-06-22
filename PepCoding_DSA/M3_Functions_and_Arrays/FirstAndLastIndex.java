package PepCoding_DSA.M3_Functions_and_Arrays;

import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt(); //getting data from user for which we will calculate first and last index


        // Finding first index
        int low = 0;
        int high = arr.length - 1;
        int first_index = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(data < arr[mid]){
                high = mid - 1;
            }
            else if(data > arr[mid]){
                low = mid + 1;
            }
            else{
                first_index = mid; //temporarily setting first_index as mid and then checking in left side if there is more data elements
                high = mid - 1;
            }
        }
        System.out.println("First index : " + first_index);

        // Finding last index
        low = 0;
        high = arr.length - 1;
        int last_index = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(data < arr[mid]){
                high = mid - 1;
            }
            else if(data > arr[mid]){
                low = mid + 1;
            }
            else{
                last_index = mid; //temporarily setting first_index as mid and then checking in left side if there is more data elements
                low = mid + 1;
            }
        }

        System.out.println("last index : " + last_index);
        sc.close();

    }
}
