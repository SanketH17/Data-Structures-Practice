package Binary_Search;

import java.util.*;

public class P12_FloorInSortedArray {

    static int ans;

    public static int floor(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;

        while(l < r) {
            int mid = (l + r) / 2;
            
            if(arr[mid] <= x) {
                ans = mid;
                l = r + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ans = -1;
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        floor(arr, x);
        System.out.println(ans);
        sc.close();
    }
}
