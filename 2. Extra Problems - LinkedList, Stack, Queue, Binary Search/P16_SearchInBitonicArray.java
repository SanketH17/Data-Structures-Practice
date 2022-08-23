import java.util.*;
/*

Input :
 7 
 3 9 10 20 17 5 1 
 20

 Output :
 3

 Input :
 9 
 5 6 7 8 9 10 3 2 1 
 30

 Output :
 -1
 
*/
public class P16_SearchInBitonicArray {

    public static int findPeek(int[] arr, int start, int end) {

        if (start == end) {
            return start;
        }

        int mid = (start + end) / 2;

        // if peek element is at the 0th position
        if (mid == 0 && arr[mid] > arr[mid + 1]) {
            // this is the peek element
            return mid;
        }

        // if the peek element is at the (n-1)th position
        if (mid == arr.length-1 && arr[mid] > arr[mid - 1]) {
            return mid;
        }

        // if peek is at mid then return mid
        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
            return mid;
        }

        // if mid is less than its right element then -> go right
        if (arr[mid] < arr[mid + 1]) {
            return findPeek(arr, mid + 1, end);
        } else {
            // if mid is less than its left element then -> go left
            return findPeek(arr, start, mid - 1);
        }
    }

    public static int binarySearchIncr(int[] arr, int start, int end, int x) {
        // base case
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == x)
            return mid;

        if (arr[mid] > x) {
            // go left
            return binarySearchIncr(arr, start, mid - 1, x);
        } else {
            // go right
            return binarySearchIncr(arr, mid + 1, end, x);
        }
    }

    public static int binarySearchDecr(int[] arr, int start, int end, int x) {
        // base case
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == x)
            return mid;

        if (arr[mid] < x) {
            // go left
            return binarySearchDecr(arr, start, mid - 1, x);
        } else {
            // go right
            return binarySearchDecr(arr, mid + 1, end, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int bitonicPoint = findPeek(arr, 0, n - 1);
        //System.out.println(bitonicPoint);

        // we have now index of bitonicPoint from the array
        // apply Binary Search on left and right

        int index;

        index = binarySearchIncr(arr, 0, bitonicPoint, x);
        if (index != -1) {
            System.out.println(index);
            return;
        }
        index = binarySearchDecr(arr, bitonicPoint + 1, n - 1, x);
        System.out.println(index);
        

        sc.close();
    }
}
