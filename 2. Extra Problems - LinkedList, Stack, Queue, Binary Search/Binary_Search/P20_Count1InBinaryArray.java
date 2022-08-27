package Binary_Search;

import java.util.*;

public class P20_Count1InBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = countOnes(arr);
        System.out.println(ans);
        sc.close();
    }

    public static int countOnes(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        //int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            // if mid is the last 1
            if((mid == high || arr[mid + 1] == 0) && arr[mid] == 1) {
                return mid+1;
            }

            if(arr[mid] == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }
}
