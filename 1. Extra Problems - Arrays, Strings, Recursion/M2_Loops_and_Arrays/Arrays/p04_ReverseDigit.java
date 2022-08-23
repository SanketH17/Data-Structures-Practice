package ProblemSolving.M2_Loops_and_Arrays.Arrays;

import java.util.*;
/*
123
3*10 = 0 + 30 = 30
30 + 2 * 10
 */
public class p04_ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        int rem;
        //int temp = n;
        while (n > 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        System.out.println(res);
        sc.close();
    }
}
