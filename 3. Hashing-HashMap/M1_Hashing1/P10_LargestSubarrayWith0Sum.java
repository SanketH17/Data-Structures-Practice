import java.util.Scanner;
import java.util.*;

public class P10_LargestSubarrayWith0Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
        sc.close();
    }

    public static int solution(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // sum is the key
        int i = -1;
        int sum = 0;
        map.put(sum, i);

        int maxl = 0;
        while (i < arr.length - 1) {
            i++;
            sum += arr[i];

            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxl = Math.max(maxl, len);
            } else {
                map.put(sum, i);
            }
        }

        return maxl;
    }
}
