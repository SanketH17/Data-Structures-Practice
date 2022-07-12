package M07_Time_and_Space_Complexity;


import java.util.*;
public class p14_PivotElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int pivot = findPivot(arr);
        System.out.println(pivot);

        sc.close();
    }

    public static int findPivot(int[] arr){
        int low = 0;
        int high  = arr.length - 1;

        while(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] < arr[high]){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return arr[high];
    }

}




























/*

Time Complexity :
O(logn)

Here every time the length of the array gets halved. Now if you have an array of length 8 how many 
times can you half it until it becomes an array of length 1. First, 8 can be halved to 4, then 2nd time 
if you half it, it will become 2 and then 3rd time it will become 1. So 3 times. Every time we are halving 
we are dividing the array and the log is nothing but repeated division. So, the number of times we can divide 
an array of length n will be log2n. So time complexity is O(log2n).

SPACE COMPLEXITY :
O(1)

No auxiliary arrays are used, hence the space complexity remains O(1) i.e constant.

 */