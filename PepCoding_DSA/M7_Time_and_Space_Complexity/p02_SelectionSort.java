package M7_Time_and_Space_Complexity;



/*
Initialize minimum value(min_idx) to location 0
Traverse the array to find the minimum element in the array
While traversing if any element smaller than min_idx is found then swap both the values.
Then, increment min_idx to point to next element
Repeat until array is sorted
 */
import java.util.*;
public class p02_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr);
        print(arr); // printing the array

        sc.close();
    }

    public static void SelectionSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;

            for(int j = i + 1; j < arr.length; j++){
                if(isSmaller(arr, j, min))
                    min = j;
            }
            swap(arr, i, min);
        }

        

    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
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

