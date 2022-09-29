package M1_Hashing1;

import java.util.Scanner;
import java.util.*;

public class PairSumDivisibleByK {

    public static int findPair(int n, int[] arr, int k) {
        int numOfPairs = 0;
        HashMap<Integer, Integer> remFreqMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int rem = arr[i] % k; 
            int compRem = k - rem;

            if(rem == 0 && remFreqMap.containsKey(0) == true) {
                numOfPairs += remFreqMap.get(0);
            } else if(rem != 0 &&  remFreqMap.containsKey(compRem) == true) {
                numOfPairs += remFreqMap.get(compRem);
            }
            remFreqMap.put(rem, remFreqMap.getOrDefault(rem, 0) + 1);
        }
        return numOfPairs;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans = findPair(n, arr, k);
        System.out.println(ans);

        sc.close();
    }
}
