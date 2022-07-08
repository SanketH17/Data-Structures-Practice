package PepCoding_DSA.M6_Recursion_and_BackTracking.M2_Recursion_In_Arrays;


import java.util.*;


public class p2_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        displayArrReverse(arr, 0);

        sc.close();
    }

    // Expectation - last index se start tk sab print kar de
    // Faith - last index se index + 1 tk print karna janta hai
    public static void displayArrReverse(int[] arr, int index){

        if(index == arr.length){
            return;
        }

        displayArrReverse(arr, index + 1);
        System.out.println(arr[index]);

    }

}
