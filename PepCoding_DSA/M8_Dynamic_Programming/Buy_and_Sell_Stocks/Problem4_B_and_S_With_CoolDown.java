package Buy_and_Sell_Stocks;

import java.util.*;

public class Problem4_B_and_S_With_CoolDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int obsp = -arr[0]; // old bought state profit
        int ossp = 0; // old sold state price
        int ocsp = 0; // old cooling state price

        for(int i = 1; i < arr.length; i++){
            int nbsp = 0; // new bought  state profit
            int nssp = 0; // new sold state price
            int ncsp = 0; // new cooling state price

            // Determine new bought state profit
            if(ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }
            else{
                nbsp = obsp;
            }

            // Determine sold state profit
            if(obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            }
            else{
                nssp = ossp;
            }

            // Determine cooling state profit
            if(ossp > ocsp){
                ncsp = ossp;
            }
            else{
                ncsp = ocsp;
            }

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;

        }

        System.out.println(ossp);

        sc.close();
    }
}


/*

Time Complexity :
O(N)

Since, we are traversing through the array of n integers (representing days), and filling 3 states for each element, the time complexity will be O(3 * N) = O(N).

SPACE COMPLEXITY :
O(1)

Since we have replaced our logic of two arrays with just 6 integer variables, the space complexity will reduce from O(N) to O(1).

 */