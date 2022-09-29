package M1_Hashing1;

import java.util.*;

public class P05_ContainsDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : arr) {
            if(map.containsKey(val)) {
                int of = map.get(val);
                int nf = of + 1;
                map.put(val, nf);
            } else {
                map.put(val, 1);
            }
        }


        for(int value : map.values()) {
            if(value >= 2) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
       

    }
}
