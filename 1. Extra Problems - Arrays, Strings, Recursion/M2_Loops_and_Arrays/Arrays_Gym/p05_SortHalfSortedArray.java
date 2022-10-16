package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;


/*

Sample Input
6
2 3 8 -1 7 10

Sample Output
-1 2 3 7 8 10
 
*/

public class p05_SortHalfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //
        int l = 0;
        int mid = (arr.length - 1) / 2;
        int r = mid + 1;
        int[] ans = new int[n];
        int k = 0;
        while(l <= mid && r < arr.length) {
            if(arr[l] < arr[r]){
                ans[k] = arr[l];
                l++;
                k++;
            } else {
                ans[k] = arr[r];
                r++;
                k++;
            }
        }
        while(l <= mid) {
            ans[k] = arr[l];
            l++;
            k++;
        }
        while (r < arr.length) {
            ans[k] = arr[r];
            k++;
            r++;
        }
        
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}














