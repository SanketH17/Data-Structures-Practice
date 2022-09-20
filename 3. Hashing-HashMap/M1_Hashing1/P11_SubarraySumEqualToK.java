import java.util.*;

public class P11_SubarraySumEqualToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, target));

        sc.close();
    }

    public static int solution(int[] arr, int target) {
        // write your code here
        int ans = 0;
        HashMap<Integer, Integer> fmap = new HashMap<>();

        int sum = 0;
        int i = -1;
        fmap.put(sum, 1);

        while (i < arr.length - 1) {

            i++;
            sum += arr[i];

            int rsum = sum - target;

            if (fmap.containsKey(rsum)) {
                ans += fmap.get(rsum);
            }
            int ofreq = fmap.getOrDefault(sum, 0);
            fmap.put(sum, ofreq + 1);
        }
        return ans;
    }

}
