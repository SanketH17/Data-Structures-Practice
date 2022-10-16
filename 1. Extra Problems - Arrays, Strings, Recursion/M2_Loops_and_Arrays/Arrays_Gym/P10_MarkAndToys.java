package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P10_MarkAndToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= k) {
                count++;
                k = k - arr[i];
            }
            
        }
        System.out.println(count);
        sc.close();
    }
}
