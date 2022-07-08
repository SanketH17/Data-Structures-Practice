package M8_Dynamic_Programming;


import java.util.*;

public class p23_FriendsPairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2] * (i - 1);
     
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

 */