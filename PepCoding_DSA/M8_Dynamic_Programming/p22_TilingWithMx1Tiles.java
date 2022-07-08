package M8_Dynamic_Programming;



/*

Sample Input
39
16
Sample Output
61

 */
import java.util.*;

public class p22_TilingWithMx1Tiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // height
        int m = sc.nextInt();

        int[] dp = new int[n + 1];

        for(int i = 1; i <= n; i++){
            if(i < m){
                dp[i] = 1;
            }
            else if(i == m){
                dp[i] = 2;
            }
            else{
                dp[i] = dp[i - 1] + dp[i - m];
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}

/*

Time Complexity:
The time complexity of this method is O(n) where n is the length of the floor because we are just traversing an array of length n+1.

Space Complexity:
The space complexity of the above procedure is O(n) as we have created a dp array of size n+1.
Dear reader, we hope that you have understood this problem and also understood how a problem can be understood in recursion and converted into a Dynamic Programming problem.

 */