package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P11_PrintRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int flag = 0;
        Arrays.sort(arr);
        int count;

        for(int i = 0; i < arr.length; i++) {
            count = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    flag = 1;
                    count++;
                } else {
                    break;
                } 
            }
            if(count > 1) {
                System.out.print(arr[i] + " ");
            }
        }
        if(flag == 0) {
            System.out.print("-1");
        }
        sc.close();
    }
}




















