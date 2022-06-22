package PepCoding_DSA.M6_Recursion_and_BackTracking.M1_Introduction_to_Recursion;

import java.util.Scanner;

public class p6_XpowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = power(x, n);
        System.out.println(xn);

        sc.close();
    }

    public static int power(int x, int n){

        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

}
