package M1_Conditionals;

import java.util.*;
/*
F = C × 9/5 + 32
 */

public class p03_CelciusToF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        sc.close();
        int F = C * 9 / 5 + 32;
        System.out.println(F);
    }
}
