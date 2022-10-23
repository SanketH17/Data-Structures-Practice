package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P17_NobleInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int size = arr.length;
        int ans = -1;
        for(int i = 0; i < size; i++) {
            int count = 0;

            for(int j = 0; j < size; j++) {
                if(arr[i] < arr[j]) {
                    count++;
                }
            }
            if(count == arr[i]) {
                ans = 1;
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }



}
