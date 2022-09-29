package M3_SlidingWindow;



import java.util.Scanner;

public class P02_RahulAndMinimumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findMinLengthSubArray(arr, n, target);
        System.out.println(ans);
        sc.close();
    }

    public static int findMinLengthSubArray(int[] arr, int n, int target) {
        int si = 0, ei = 0, sum = 0, minLength = Integer.MAX_VALUE;
        while (ei < n) {
            sum += arr[ei];
            ei++;
            while (sum > target) {
                minLength = Math.min(minLength, ei - si);
                sum -= arr[si];
                si++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
