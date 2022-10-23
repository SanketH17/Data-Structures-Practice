package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

/*
4
1 2 3 4

3 1 0 0 

*/

public class P21_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] % temp == 0) {
                    count++;
                }
            }
            ans[i] = count;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
