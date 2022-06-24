package PepCoding_DSA.M7_Time_and_Space_Complexity;

/*
i to k       --> unknown
k + 1 to end --> 2
j to i - 1   --> 1
0 to j - 1   --> 0
 */


import java.util.*;
public class p12_Sort012 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        sort012(arr);
        print(arr);
        scn.close();
      }

    public static void sort012(int[] arr) {
        int j = 0; //0 to j - 1   --> 0's area
        int i = 0; //j to i - 1   --> 1's area
        int k = arr.length - 1; // k + 1 to end --> 2's area

        //i to k --> unknown
        while(i <= k){
            if(arr[i] == 0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else{
                swap(arr, i, k);
                k--;
            }
        }

    }

    public static void swap(int arr[], int i, int j) {
        System.out.println("Swapping " + arr[i] + " & " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
