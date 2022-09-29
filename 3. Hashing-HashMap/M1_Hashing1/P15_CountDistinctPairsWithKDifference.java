package M1_Hashing1;

import java.util.*;

public class P15_CountDistinctPairsWithKDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findDistinctPairsWithKDiff(n, arr, k);
        System.out.println(ans);

        sc.close();
    }

    public static int findDistinctPairsWithKDiff(int n, int[] arr, int k) {     
        // case 1 : k == 0
        if(k == 0) {
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            for(int i = 0; i < n; i++) {
                freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            }
            int ans = 0;
            for(int i = 0; i < n; i++) {
                if(freqMap.get(arr[i]) > 1) {
                    ans += 1;
                    freqMap.put(arr[i], 0);
                }
            }
            return ans;
        }

        // Eg :
        // arr :         5 3 4 2 6 1  k = 3
        // Set :         5 3 4 2 6 1
        // complement :  8 6 7 5 9 4 

        // case 2 : 
        else {
            HashSet<Integer> comp = new HashSet<>();
            for(int i = 0; i < n; i++) {
                comp.add(arr[i]);
            }

            int ans = 0;
            for(int i = 0; i < n; i++) {
                int complementNum = arr[i] + k;
                if(comp.contains(complementNum) == true) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
