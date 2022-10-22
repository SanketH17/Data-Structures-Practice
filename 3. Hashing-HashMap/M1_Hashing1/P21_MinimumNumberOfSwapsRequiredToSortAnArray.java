package M1_Hashing1;


import java.util.*;

public class P21_MinimumNumberOfSwapsRequiredToSortAnArray {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = countSwaps(arr, n);
        System.out.println(ans);

        sc.close();
    }

    public static int countSwaps(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]) {
                ans++;
                int init = arr[i];
                swap(arr, i, map.get(temp[i]));

                map.put(init, map.get(temp[i]));
                map.put(temp[i], i);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
