package ProblemSolving.M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P23_MissingElementinAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = arr[1] - arr[0];

        int missingElement = 0;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i + 1] - arr[i] != d) {
                missingElement = arr[i] + d;
                break;
            }
        }
        System.out.println(missingElement);
        sc.close();
    }
}
