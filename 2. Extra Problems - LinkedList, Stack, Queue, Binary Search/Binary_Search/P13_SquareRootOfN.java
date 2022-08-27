package Binary_Search;

import java.util.*;

public class P13_SquareRootOfN {

    static int ans;

    public static void squareRoot(int x, long start, long end) {
        // base case
        if(start > end) {
            return;
        }

        long mid = (start + end) / 2;

        if(mid * mid <= (long)x) {
            // go right
            ans = (int)mid;
            squareRoot(x, mid+1, end);
        } else {
            squareRoot(x, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        ans = -1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        squareRoot(n, 1, n);
        System.out.println(ans);
        sc.close();
    }
}


/*



public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i * i <= n; i++) {
            ans = i;
        }

        System.out.println(ans);
    }




Input : 30

i = 1 -> 1 * 1 <= 30 -> ans = 1
i = 2 -> 2 * 2 <= 30 -> ans = 2
i = 3 -> 3 * 3 <= 30 -> ans = 3
i = 4 -> 4 * 4 <= 30 -> ans = 4
i = 5 -> 5 * 5 <= 30 -> ans = 5
i = 6 -> 6 * 6 >  30 -> 

ans = 5

*/