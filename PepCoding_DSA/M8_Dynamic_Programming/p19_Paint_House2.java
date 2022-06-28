

/*

Sample input :
4 3
1 5 7
5 8 4
3 2 9
1 2 4

Sample output :
8

*/

import java.util.*;

public class p19_Paint_House2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[n][c];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][c];

        
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for(int j = 0; j < arr[0].length; j++){
            dp[0][j] = arr[0][j];

            if(arr[0][j] <= least){
                sleast = least;
                least = arr[0][j];
            }
            else if(arr[0][j] <= sleast){
                sleast = arr[0][j];
            }
        }


        /*********************************************************/

        for(int i = 1; i < dp.length; i++){

            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;

            for(int j = 0; j < dp[0].length; j++){
                if(least == dp[i - 1][j]){
                    dp[i][j] = sleast + arr[i][j];
                }
                else{
                    dp[i][j] = least + arr[i][j];
                }

                if(dp[i][j] <= nleast){
                    nsleast = nleast;
                    nleast = dp[i][j];
                }
                else if(dp[i][j] <= nsleast){
                    nsleast = dp[i][j];
                }
            }
            least = nleast;
            sleast = nsleast;
        }

        System.out.println(least);

        sc.close();

    }
}








/*

O(n^3) Program

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[n][c];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][c];

        for(int j = 0; j < arr[0].length; j++){
            dp[0][j] = arr[0][j];
        }


        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){

                int min = Integer.MAX_VALUE;
                for(int k = 0; k < arr[0].length; k++){
                    if(k != j){
                        if(dp[i - 1][k] < min){
                            min = dp[i - 1][k];
                        }
                    }
                }

                dp[i][j] = arr[i][j] + min;

            }
        }

        int min = Integer.MAX_VALUE;
        for(int k = 0; k < dp[0].length; k++){
            if(dp[n - 1][k] < min){
                min = dp[n - 1][k];
            }
        }

        System.out.println(min);
        sc.close();

    }


*/