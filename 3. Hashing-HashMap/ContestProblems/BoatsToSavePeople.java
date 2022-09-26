
import java.util.*;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int limit = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findNoOfBoatsToSavePeople(arr, n, limit);
        System.out.println(ans);
        sc.close();
    }

    public static int findNoOfBoatsToSavePeople(int[] arr, int n, int limit) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1, count = 0;
        while(i <= j) {
            if(arr[i] + arr[j] <= limit) {
                i++;j--;
            } else {
                j--;
            }
            count++;
        }
        return count;
    }

}