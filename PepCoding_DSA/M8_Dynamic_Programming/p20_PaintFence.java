
/*

Problem Discussion :
In this problem you are given a number n and a number k in separate lines, representing the number of fences and number of colors.

You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive fences have the same color.


For example:

Input: n = 5, k = 3

Output: 180

 */


import java.util.*;

public class p20_PaintFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        long same = k * 1;
        long diff = k * (k - 1);
        long total = same + diff;

        for(int i = 3; i <= n; i++){
            same = diff * 1;
            diff = total * (k - 1);
            total = same + diff;
        }

        System.out.println(total);
        sc.close();

    }
}


/*

Time Complexity :
The time complexity of this procedure is O(n) where n is the length of an array.

SPACE COMPLEXITY :
Since we have used two integer variables which take constant space, instead of two arrays of size n + 1, 
hence we are able to reduce the space complexity from O(n ) to O(1) also we have not used any extra memory or any extra data structure.

 */