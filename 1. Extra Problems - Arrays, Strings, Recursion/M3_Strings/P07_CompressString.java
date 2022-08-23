package ProblemSolving.M3_Strings;

import java.util.*;
/* 

Input : AAACCCBBD 
Output: A3C3B2D1

*/

public class P07_CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(compression(str));
        sc.close();
    }

    public static String compression(String str) {
        String s = str.charAt(0) + "";

        int count = 1;
        /*
            Input : AAACCCBBD 
            Output: A3C3B2D1
         */
        for(int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            int prev = str.charAt(i - 1);

            if(curr == prev) {
                count++;
            } else {
                if(count >= 1) {
                    s = s + count;
                    count = 1;
                }
                s = s + curr;
            }
        }

        if(count >= 1) {
            s = s + count;
            count = 1;
        }
        return s;
    }
}
