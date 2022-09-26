
import java.util.*;

public class P01_PriyanksAndToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = find(arr, n);
        System.out.println(ans);
        sc.close();
    }

    public static int find(int[] arr, int n) {
        int count = 1;
        Arrays.sort(arr);
        int temp = arr[0];

        for(int i = 0; i < n; i++) {
            if(arr[i] > temp + 4) {
                count++;
                temp = arr[i];
            }
        }
        return count;
    }

}
