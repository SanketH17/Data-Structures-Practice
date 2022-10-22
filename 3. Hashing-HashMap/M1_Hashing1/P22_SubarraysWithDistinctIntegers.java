package M1_Hashing1;


import java.util.*;

public class P22_SubarraysWithDistinctIntegers {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int ans = subarraysWithKDistinct(arr, b);
        System.out.println(ans);

        sc.close();
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithKSize(nums, k) - subarraysWithKSize(nums, k - 1);
    }

    public static int subarraysWithKSize(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        int count = 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            hs.put(nums[j], hs.getOrDefault(nums[j], 0) + 1);

            while (hs.size() == k + 1) {
                hs.put(nums[i], hs.get(nums[i]) - 1);
                if (hs.get(nums[i]) == 0)
                    hs.remove(nums[i]);
                i++;
            }
            count += j - i + 1;
            j++;
        }
        return count;
    }
}
