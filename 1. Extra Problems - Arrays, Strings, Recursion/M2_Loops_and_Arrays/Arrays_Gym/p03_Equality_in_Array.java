package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class p03_Equality_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        
        int max = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            int checkElement = arr[i];
            for(int j = 0; j < n; j++) {
                if(arr[j] == checkElement) {
                    cnt++;
                }
            }
            if(cnt > max) {
                max = cnt;
            }
        }
        System.out.println(n - max);
        sc.close();
    }
}
