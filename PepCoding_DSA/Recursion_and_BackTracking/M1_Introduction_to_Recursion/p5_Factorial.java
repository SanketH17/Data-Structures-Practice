package PepCoding_DSA.Recursion_and_BackTracking.M1_Introduction_to_Recursion;

import java.util.*;

public class p5_Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println(f);

        sc.close();
    
    }

    public static int factorial(int n){

        if(n == 1){
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;

    }
}
