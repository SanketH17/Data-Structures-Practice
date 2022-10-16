package M2_Loops_and_Arrays.Arrays;
import java.util.*;

public class p05_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
