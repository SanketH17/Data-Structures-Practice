package M2_Loops_and_Arrays.Arrays;
import java.util.*;

public class p02_FirstPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = -1;
        for(int i = 0; i < arr.length; i++) {

            if(i == 0) {
                if(arr[i] > arr[i + 1]) {
                    ans = i;
                    break;
                }
            } else if (i == arr.length - 1) {
                if(arr[i] > arr[i- 1]) {
                    ans = i;
                    break;
                }
            } else {
                if(arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                    ans = i;
                    break;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
