package M2_Loops_and_Arrays.Arrays;
import java.util.*;

public class p01_SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        //
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == k) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
