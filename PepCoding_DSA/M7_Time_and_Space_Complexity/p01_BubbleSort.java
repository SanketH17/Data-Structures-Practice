package M7_Time_and_Space_Complexity;



/*

Case	             Time Complexity
Best Case	             O(n)
Average Case	         O(n2)
Worst Case           	 O(n2)

Best Case Complexity - It occurs when there is no sorting required, i.e. the array is already sorted. 
The best-case time complexity of bubble sort is O(n).


Average Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending. 
The average case time complexity of bubble sort is O(n2).


Worst Case Complexity - It occurs when the array elements are required to be sorted in reverse order. 
That means suppose you have to sort the array elements in ascending order, but its elements are in descending order. 
The worst-case time complexity of bubble sort is O(n2).
 */

import java.util.*;
public class p01_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        print(arr); // printing the array

        sc.close();
    
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        for(int itr = 1; itr < n; itr++){ // just controlling the iterations over the array
            for(int j = 0; j < n - itr; j++){
                if(isSmaller(arr, j + 1, j) == true){
                    swap(arr, j + 1, j); // swapping between the two elements
                }
            }
        }

    }

    public static boolean isSmaller(int[] arr, int i, int j) { //comparing arr[j] and arr[j+1] if arr[j+1] is < arr[j] then return true and then swap both the elements
        System.out.println("Comparing " + arr[i] + " & " + arr[j] + "\n");
        if(arr[i] < arr[j]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " & " + arr[j] + "\n");
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
