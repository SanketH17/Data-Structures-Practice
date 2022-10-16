package M2_Loops_and_Arrays.Arrays;
import java.util.*;

public class p04_FacingTheSun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lmax = arr[0];
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] >= lmax) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
