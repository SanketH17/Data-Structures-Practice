

import java.util.*;
public class p01_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibn = fib(n, new int[n + 1]);
        System.out.println(fibn);
        sc.close();
    }

    public static int fib(int n, int[] qb) {

        if(n == 0 || n == 1){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }


        System.out.println("Hi " + n);
        int fibnm1 = fib(n - 1, qb);
        int fibnm2 = fib(n - 2, qb);
        int res = fibnm1 + fibnm2;

        qb[n] = res;
        return res;
    }
}
