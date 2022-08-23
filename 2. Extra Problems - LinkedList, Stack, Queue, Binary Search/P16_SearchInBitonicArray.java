
import java.util.*;

public class P16_SearchInBitonicArray {

    public static int findPeek(int[] arr, int start, int end) {

        if(start == end) {
            return start;
        }
        
        int mid = (start + end) / 2;

        // if peek element is at the 0th position
        if(mid == 0 && arr[mid] > arr[mid + 1]) {
            // this is the peek element
            return mid;
        }

        // if the peek element is at the (n-1)th  position
        if(mid == arr.length && arr[mid] > arr[mid - 1]) {
            return mid;
        } 

        // if peek is at mid then return mid
        if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        
        // if mid is less than its right element then -> go right
        if(arr[mid] < arr[mid + 1]) {
            return findPeek(arr, mid + 1, end);
        } else {
            // if mid is less than its left element then -> go left
            return findPeek(arr, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //int x = sc.nextInt();

        int bitonicPoint = findPeek(arr, 0, n - 1);
        System.out.println(bitonicPoint);
    }
}
