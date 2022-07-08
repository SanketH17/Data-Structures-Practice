package M7_Time_and_Space_Complexity;




import java.util.*;
public class p06_QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length - 1); // arr, low, high
        print(arr);
        sc.close();

    }

    public static void quickSort(int[] arr, int low, int high) {
        
        if(low > high){
            return;
        }

        int pivot = arr[high];
        int pi = partition(arr, pivot, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);

    }

        // 0 to j - 1 -->   <= pivot
        // j to i - 1 -->   > pivot
        // i to end   -->   unknown
    public static int partition(int[] arr, int pivot, int lo, int hi) {
        System.out.println("pivot -> " + pivot);
        int i = lo, j = lo;
        while (i <= hi) {
          if (arr[i] <= pivot) {
            swap(arr, i, j);
            i++;
            j++;
          } else {
            i++;
          }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
      }

    public static void swap(int[] arr, int i, int j) {
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
