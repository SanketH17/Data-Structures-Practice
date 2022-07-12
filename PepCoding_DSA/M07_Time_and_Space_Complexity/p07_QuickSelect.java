package M07_Time_and_Space_Complexity;



/*
ip: 
5
7 -2 4 1 3
3
op: 
Swapping -2 and 7
Swapping 1 and 7
Swapping 3 and 4
Pivot element - > 2
3

 */
import java.util.Scanner;

public class p07_QuickSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int res = quickSelect(arr, 0, arr.length - 1, k-1); // arr, low, high
        System.out.println(res);
        sc.close();
    }

    public static int quickSelect(int[] arr, int lo, int hi, int k) {

        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        if (pi > k)
        {
          return quickSelect(arr, lo, pi - 1, k);
        }
        else if (pi < k)
        {
          return quickSelect(arr, pi + 1, hi, k);
        }
        return pivot;
      }



    // 0 to j - 1 -->   <= pivot
    // j to i - 1 -->    > pivot
    // i to end   -->    unknown
    public static int partition(int[] arr, int pivot, int low, int high) {
        int i = low; 
        int j = low;
        while(i <= high){
            if(arr[i] <= pivot){
                swap(arr, i, j);
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println("Pivot element - > " + (j - 1));
        return (j - 1);

    }

    public static void swap(int[] arr, int i, int j){
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
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
