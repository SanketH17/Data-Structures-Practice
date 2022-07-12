package M08_Dynamic_Programming.Buy_and_Sell_Stocks;

import java.util.*;

public class Problem5_B_and_S_Two_Trans_Allowed_Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int mpist = 0; // max profit if sold today
        int leastsf = arr[0]; // least so far
        int[] dpl = new int[arr.length]; // dp array which is storing - maximum profit if sold up to today
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < leastsf){
                leastsf =arr[i];
            }
            mpist = arr[i] - leastsf;
            if(mpist > dpl[i - 1]){ // if max profit is greater than previous profit
                dpl[i] = mpist;
            }
            else{ // else take the maximum profit from previous state 
                dpl[i] = dpl[i - 1];
            }
        }





            int mpibt = 0; // max profit if bought today
            int maxat = arr[arr.length - 1]; // maximum at today
            int[] dpr = new int[arr.length];

            for(int i = arr.length - 2; i >= 0; i--){
                if(arr[i] > maxat){
                    maxat = arr[i];
                }

                mpibt = maxat - arr[i];
                if(mpibt > dpr[i + 1]){
                    dpr[i] = mpibt;
                }
                else{
                    dpr[i] = dpr[i + 1];
                }
            }

            int op = 0; // overall profit
            for(int i = 0; i < arr.length; i++){
                if(dpl[i] + dpr[i] > op){
                    op = dpl[i] + dpr[i];
                }
            }

            System.out.println(op);
            sc.close();
        

    }


}

/*

Time Complexity :
The time complexity of the above code is O(n) as we are traversing the arrays of length n, where n is the number of days.

SPACE COMPLEXITY :
As we have created two arrays of size n+1, the space complexity of the above method is O(n).

 */