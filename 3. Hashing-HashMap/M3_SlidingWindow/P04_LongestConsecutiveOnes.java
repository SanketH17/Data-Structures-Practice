

import java.util.*;

public class P04_LongestConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findLongestSequenceOnes(arr, n, k);
        System.out.println(ans);
        sc.close();
    }

    public static int findLongestSequenceOnes(int[] arr, int n, int k) {
        int ans = 0;
        int j = -1;
        int ZeroCount = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                ZeroCount++;
            }

            while(ZeroCount > k) {
                j++;
                if(arr[j] == 0) {
                    ZeroCount--;
                }
            }

            int len = i - j;
            if(len > ans) {
                ans = len;
            }
        }
        return ans;
    }
}
