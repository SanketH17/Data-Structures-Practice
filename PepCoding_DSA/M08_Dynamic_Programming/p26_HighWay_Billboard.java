package M08_Dynamic_Programming;



/*

20
5
6 7 12 14 15
5 8 5 3 1
5

*/


/*                                            O(n^2)                                          */




import java.util.*;

public class p26_HighWay_Billboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // the length of the road (in km)
        int m = sc.nextInt(); // no of boards can be put on the road
        int[] x = new int[m]; // boards mile no - tell the no of miles at which we can put a board
        for(int i = 0; i < m; i++){
            x[i] = sc.nextInt();
        }

        int[] revenue = new int[m];
        for(int i = 0; i < m; i++){ // tell the revenue for each board
            revenue[i] = sc.nextInt(); // the least distance between the two boards 
        }

        int t = sc.nextInt();

        int ans = solution(n, x, revenue, t);
        System.out.println(ans);
        sc.close();

    }

    public static int solution(int n, int[] x, int[] rev, int t){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < x.length; i++){
            map.put(x[i], rev[i]);
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            if(map.containsKey(i) == false){
                dp[i] = dp[i - 1];
            }
            else{
                int boardNotInstalled = dp[i - 1];
                int boardInstalled = map.get(i);
                if(i >= t + 1){
                    boardInstalled += dp[i - t - 1];
                }
                dp[i] = Math.max(boardInstalled, boardNotInstalled);
            }
        }
        return dp[n];
    }

}

/*

********************  O(n^2)  *******************

    public static int solution(int m, int[] x, int[] rev, int t){

        int[] dp = new int[x.length];
        int ans = 0;

        dp[0] = rev[0];
        for(int i = 1; i < x.length; i++){
            int max = 0;

            for(int j = 0; j < i; j++){
                int dist = x[i] - x[j];
                if(dist > t){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + rev[i];
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }



 */