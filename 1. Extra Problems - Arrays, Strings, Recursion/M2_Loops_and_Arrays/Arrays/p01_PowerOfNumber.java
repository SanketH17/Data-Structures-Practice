package M2_Loops_and_Arrays.Arrays;

import java.util.*;

public class p01_PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        long res = 1;
        while (exp != 0) {
            res = res * base;
            exp--;
        }
        System.out.println(res);
        sc.close();
    }
}
