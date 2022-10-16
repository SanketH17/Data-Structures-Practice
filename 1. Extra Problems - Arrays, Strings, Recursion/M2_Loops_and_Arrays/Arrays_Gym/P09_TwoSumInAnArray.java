package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class P09_TwoSumInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //Arrays.sort(a);
        int[] res = new int[2];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] + a[j] == target){
                    res[0] = i;
                    res[1] = j; 
                }
            }
        }
        for(int i = 1; i >= 0; i--) {
            System.out.print(res[i] + " ");
        }

        sc.close();
    }
}










