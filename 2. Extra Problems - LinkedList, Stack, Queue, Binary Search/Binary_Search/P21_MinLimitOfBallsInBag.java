package Binary_Search;

import java.util.Scanner;

public class P21_MinLimitOfBallsInBag {
    
    public static boolean isPossible(int mid, int[] arr, int maxop, int n) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            count = count + (arr[i] - 1) / mid;
            if(count > maxop) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int m = sc.nextInt(); // maxOperations
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 1;
        int high = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            high = Math.max(high, arr[i]);
        }

        while(low < high) {
            int mid = low + (high - low) / 2;
            if(isPossible(mid, arr, m, n)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(low);

        sc.close();
    }
}
