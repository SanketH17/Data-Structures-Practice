package M2_Loops_and_Arrays.Arrays;
import java.util.*;

public class p06_SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
