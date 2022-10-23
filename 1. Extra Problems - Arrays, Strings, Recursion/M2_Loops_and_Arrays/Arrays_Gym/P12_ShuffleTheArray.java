package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P12_ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[2*n];
        for(int i = 0; i < 2*n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++) {
            ans[2*i] = arr[i];
            ans[2 * i + 1] = arr[i + n];
        }

        for(int i = 0; i < 2*n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
