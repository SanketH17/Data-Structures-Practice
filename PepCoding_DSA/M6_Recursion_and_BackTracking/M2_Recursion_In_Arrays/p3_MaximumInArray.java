package M6_Recursion_and_BackTracking.M2_Recursion_In_Arrays;


/*

Expectation: Our expectation is clear, to find the maximum element inside the array.

Faith: The faith that we can establish is that our function will be able to find the maximum value from index 1 to the end of the array 
       i.e. the smaller array. 

 */


import java.util.*;

public class p3_MaximumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = maxOfArray(arr, 0);
        System.out.println(max);

        sc.close();
    }

    public static int maxOfArray(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }

        // misa = maximum in shortest array (index + 1 to n) 
        int misa = maxOfArray(arr, index + 1);

        if(misa > arr[index]){
            return misa;
        }
        else{
            return arr[index];
        }
    }

}
