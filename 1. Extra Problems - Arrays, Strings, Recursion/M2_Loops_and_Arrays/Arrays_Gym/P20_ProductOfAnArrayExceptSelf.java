package M2_Loops_and_Arrays.Arrays_Gym;

/*




Sample Input :
4
4 3 2 10

Sample Output :
60 80 120 24

*/

import java.util.*;

public class P20_ProductOfAnArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int prod = 1;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    continue;
                } else {
                    prod = prod * arr[j];
                    ans[i] = prod;
                }
            }
        }

        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
