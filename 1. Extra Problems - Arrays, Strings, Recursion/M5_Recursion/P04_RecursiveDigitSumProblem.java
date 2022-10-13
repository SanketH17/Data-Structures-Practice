package M5_Recursion;


import java.util.*;

public class P04_RecursiveDigitSumProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String n = new String("");
        for (int i = 0; i < k; i++) {
            n += s;
        }
        System.out.println(superDigit(n));

        sc.close();
    }

    static public String superDigit(String n) {
        if (n.length() == 1) {
            return n;
        }
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }
        n = Long.toString(sum);
        return superDigit(n);
    }

}
