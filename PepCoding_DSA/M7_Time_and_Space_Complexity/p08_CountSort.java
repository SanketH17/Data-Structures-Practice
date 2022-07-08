package M7_Time_and_Space_Complexity;




/*
Count sort is an Stable algorithm.
 */
import java.util.*;

public class p08_CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        countSort(arr, min, max);
        

        sc.close();
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void countSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] ans = new int[arr.length];
        //make frequency arr
        int[] farr = new int[range];
        for (int i = 0 ; i < arr.length; i++) {
          farr[arr[i] - min]++;
        }
        //convert it into prefix sum array
        for (int i = 1 ; i < farr.length; i++) {
          farr[i] += farr[i - 1];
        }
        //stable sorting(filling ans array)
        for (int i = arr.length - 1; i >= 0; i--) {
          int pos = farr[arr[i] - min] - 1;
          ans[pos] = arr[i];
          farr[arr[i] - min]--;
        }
        //filling original array with the help of ans array
        for (int i = 0 ; i < arr.length; i++) {
          arr[i] = ans[i];
        }
        print(arr);

}
}