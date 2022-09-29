package M1_Hashing1;

import java.util.*;;

public class P13_RepeatingAndMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int repeating = 0;
        int missing = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(hs.contains(arr[i])) {
                repeating = arr[i];
               // break;
            } else {
                hs.add(arr[i]);
            }
        }


        for(int i = 1; i <= n; i++) {
            if(!hs.contains(i)) {
                missing = i;
            }
        }
        System.out.print(repeating + " " + missing);

        sc.close();
    }
}
