package Binary_Search;

import java.util.*;

public class P18_SearchForRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        //searching for left index i.e. first index
        int lo = 0;
        int hi = arr.length -1 ;
        int first_index = -1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(data < arr[mid]) {
                hi = mid - 1;
            } else if(data > arr[mid]) {
                lo = mid + 1;
            } else {
                first_index = mid;
                hi = mid - 1;
            }
        }

        // searching for the last_index in the right side 
        lo = 0;
        hi = arr.length - 1;
        int last_index = -1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
                
            if(data < arr[mid]) {
                hi = mid - 1;
            } else if(data > arr[mid]) {
                lo = mid + 1;
            } else {
                last_index = mid;
                lo = mid + 1;
            }
        }

        System.out.print(first_index + " " + last_index);

        sc.close();


    }
}
