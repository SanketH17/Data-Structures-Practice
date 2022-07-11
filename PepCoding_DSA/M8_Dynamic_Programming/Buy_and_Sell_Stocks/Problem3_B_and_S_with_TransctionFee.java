package M8_Dynamic_Programming.Buy_and_Sell_Stocks;

import java.util.*;

public class Problem3_B_and_S_with_TransctionFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int fee = sc.nextInt();

        int obsp = -arr[0]; // old bought state price
        int ossp = 0; // old selling state price

        for(int i = 1; i < arr.length; i++){
            int nbsp = 0; // new bought state price
            int nssp = 0; // new selling state price

            // Determine baought state price
            if(ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }
            else{
                nbsp = obsp;
            }

            // Determine selling state price
            if(obsp + arr[i] - fee > ossp){
                nssp = obsp + arr[i] - fee;
            }
            else{
                nssp = ossp;
            }

            obsp = nbsp;
            ossp = nssp;

        }
        System.out.println(ossp);

        sc.close();
    }


}


/*

Time Complexity :
O(N)

Since, we are traversing through the array of n integers (representing days), and filling 2 states for each day, the time complexity will be O(2 * N) = O(N).

SPACE COMPLEXITY :
O(1)

Since we have replaced our logic of two arrays with just 4 integer variables, the space complexity will reduce from O(N) to O(1).

 */