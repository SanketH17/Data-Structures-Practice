package Buy_and_Sell_Stocks;

import java.util.*;

public class Problem2_B_and_S_MultipleTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }

        int bd = 0; // buying date
        int sd = 0; // selling date
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] >= prices[i - 1]){
                sd++;
            }
            else{
                profit += prices[sd] - prices[bd];
                bd = sd = i;
            }
        }

        profit += prices[sd] - prices[bd];
        System.out.println(profit);

        sc.close();
    }
}


/*

Time Complexity:
Since, we are running a loop on a 1d array of size n, 
and calculating the minimum so far(which is constant work), hence time complexity is O(n).

Space Complexity:
We are not using any extra space, but just a few integer variables, 
hence O(1) auxiliary space required.

 */