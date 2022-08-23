package ProblemSolving.M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P15_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        sc.close();
        int ans = -1;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]){
                ans = arr[i];
                break;
            }
        }

        // missing number

        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        sum = sum - ans;

        int missing = total - sum;

        System.out.println(ans + " " + missing);

    }
}
