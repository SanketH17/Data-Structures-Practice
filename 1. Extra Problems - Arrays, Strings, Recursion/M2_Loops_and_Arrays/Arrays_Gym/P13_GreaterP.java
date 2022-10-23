package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P13_GreaterP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = -1;
        for(int i = 0; i < n; i++) {
            int temp = arr[i];
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j] > temp) {
                    count++;
                }
            }
            if(count >= temp) {
                ans = 1;
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);
    }
}
