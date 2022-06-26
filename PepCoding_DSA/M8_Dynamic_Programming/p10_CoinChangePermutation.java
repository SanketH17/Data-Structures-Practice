

/*

4
2 3 5 6
10
17

 */
import java.util.*;

public class p10_CoinChangePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] coins = new int[n];
        for(int i = 0; i < coins.length; i++){
            coins[i] = sc.nextInt();
        }

/*****************************************************************/ 
        int tar = sc.nextInt();

        int[] dp = new int[tar + 1];
        dp[0] = 1;
        for(int amt = 1; amt <= tar; amt++){
            for(int coin : coins){
                if(coin <= amt){
                    int ramt = amt - coin;
                    dp[amt] = dp[amt] + dp[ramt];
                }
            }
        }
        System.out.println(dp[tar]);
/*****************************************************************/        
        sc.close();
    }
}
