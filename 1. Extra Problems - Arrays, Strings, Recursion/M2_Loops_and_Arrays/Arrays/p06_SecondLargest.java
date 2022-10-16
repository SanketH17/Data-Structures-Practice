package M2_Loops_and_Arrays.Arrays;
import java.util.*;

public class p06_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= max) {
                smax = max;
                max = arr[i];
            } else if(arr[i] >= smax) {
                smax = arr[i];
            }
        }
        System.out.println(max + "\n" + smax);
        sc.close();
    }
}
