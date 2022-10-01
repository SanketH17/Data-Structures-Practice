package M1_Hashing1;

import java.util.*;;

/*
Input: 5 
1 4 2 5 2  -> Range of numbers (1 - n)
Output: 2 3
2 -> repeating
3 -> missing
*/

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
