package M7_Time_and_Space_Complexity;



import java.util.*;

/*
i++ hone se unknown area kam(decrease) hota hai and woh element
kisi ek area mei jata hai 
> pivot or <= pivot

input :
6
6 8 9 3 2 7
output : 
4
Swapping 3 and 6
Swapping 2 and 8
3
2
9
6
8
7


*/


public class p06_PartioningAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int pivot = sc.nextInt();
        partition(arr, pivot);
        print(arr);

        sc.close();
    } 

    public static void partition(int[] arr, int pivot){
        // 0 to j - 1 -->   <= pivot
        // j to i - 1 -->   > pivot
        // i to end   -->   unknown
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i] > pivot){
                i++;
            }
            else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }

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
