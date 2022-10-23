package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P16_Buildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int count = 1;
        
        long greaterBuilding = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > greaterBuilding) {
                greaterBuilding = arr[i];
                count++;
            }
        }


        System.out.println(count);
        sc.close();
    }
}
