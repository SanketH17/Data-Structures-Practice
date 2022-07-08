package M6_Recursion_and_BackTracking.M2_Recursion_In_Arrays;
/*
Display an array using recursion 
*/

import java.util.*;

public class p1_DIsplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        displayArr(arr, 0);

        sc.close();

    }

    // Expectation - index se end tak sab print kar de
    // Faith - index + 1 se end tk print karna janta hai
    public static void displayArr(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        displayArr(arr, index + 1);

    }
}
