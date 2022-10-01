package M1_Hashing1;

import java.util.*;

/*
Sample Input
7 2
1 7 4 3 4 8 7
Sample Output
4
*/

public class P18_FirstElementToOccurKTimes {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean flag = false;
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
            if (map.get(x) == k) {
                flag = true;
                System.out.print(x);
                break;
            }
        }
        if (flag == false) {
            System.out.println("-1");
        }
        sc.close();
    }
}
