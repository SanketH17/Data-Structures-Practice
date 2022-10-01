package M1_Hashing1;

import java.util.*;

/*
Input:
5
1 2 2 1 1 3
Output:
true

Output Format:
Print true if the number of occurrences of each value in the array is unique, or false otherwise.

*/

public class P19_UniqueNoOfOccurences {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> fmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            fmap.put(arr[i], fmap.getOrDefault(arr[i], 0) + 1);
        }

        // put all the values from freq map in hashset
        HashSet<Integer> set = new HashSet<>(fmap.values());

        // check if the size of hashset and hashmap is equal or not
        // if they are equal it means
        if (set.size() == fmap.size()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}