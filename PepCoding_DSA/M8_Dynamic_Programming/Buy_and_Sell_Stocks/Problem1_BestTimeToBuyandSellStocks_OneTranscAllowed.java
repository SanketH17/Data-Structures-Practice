package M8_Dynamic_Programming.Buy_and_Sell_Stocks;

import java.util.*;

public class Problem1_BestTimeToBuyandSellStocks_OneTranscAllowed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] prices = new int[n];
        for(int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }

        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }

            pist = prices[i] - lsf;
            if(pist > op){
                op = pist;
            }
        }

        System.out.println(op);
        sc.close();

    }
}

/*

Time Complexity:
Since, we are running a loop on a 1d array of size n, and calculating the minimum so far(which is constant work), hence time complexity is O(n).

Space Complexity:
We are not using any extra space, but just a few integer variables, hence O(1) auxiliary space required.

 */
