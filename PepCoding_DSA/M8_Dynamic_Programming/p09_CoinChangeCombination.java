/*

arr -> 2 3 5 (array of coins)
amt = 7
dp[] = 0 0 0 0 0 0 0

 */


import java.util.*;
public class p09_CoinChangeCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int amt = sc.nextInt();
        int[] dp = new int[amt + 1];
        dp[0] = 1; // to pay 0 we always have 1 way

        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i]; j < dp.length; j++){
                dp[j] = dp[j] + dp[j - arr[i]];
            }
        }

        System.out.println(dp[amt]);
        sc.close();
    }
}


/*

Time Complexity :
O(N * Amount)

Since we are running two nested loops, one on the types of denominations, i.e. n, and the inner loop from 1 to amount, 
hence the time complexity will be O(n * amount).

SPACE COMPLEXITY :
O(Amount)

We used a 1D dp array of size = amount + 1 to count all the combinations possible. 
Hence, auxiliary space of O(amount) is used.

 */