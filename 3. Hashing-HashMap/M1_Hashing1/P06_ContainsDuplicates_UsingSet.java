package M1_Hashing1;

import java.util.*;

public class P06_ContainsDuplicates_UsingSet {

    public static boolean containsDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            // number is already there in set
            if(set.contains(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = containsDuplicates(arr);
        System.out.println(ans);
        sc.close();
    }
}
