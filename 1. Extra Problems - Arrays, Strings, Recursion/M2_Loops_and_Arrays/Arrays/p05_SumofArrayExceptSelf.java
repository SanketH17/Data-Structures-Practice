package M2_Loops_and_Arrays.Arrays;
import java.util.*;

public class p05_SumofArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //
        int res[] = new int[n];
        res = solution(arr);
        
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    public static int[] solution(int[] arr) {
        int[] res = new int[arr.length];

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            res[i] = sum - arr[i];
        }

        return res;
        
    }

}
