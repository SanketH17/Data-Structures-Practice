package M12_HashMaps;

import java.util.*;

public class P04_LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int val : arr) {
                map.put(val, true);
        }

        for(int val : arr) {
            if(map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }

        int msp = 0; // max start point
        int ml = 0; // maximum length
        for(int val : arr) {
            if(map.get(val) == true) {
                int tl = 1; // temp length
                int tsp = val; // temp start point

                while(map.containsKey(tsp + tl)) {
                    tl++;
                }

                if(tl > ml) {
                    ml = tl;
                    msp = tsp;
                }

            }
        }

        for(int i = 0; i < ml; i++) {
            System.out.println(msp + i);
        }
        sc.close();
    }
}
