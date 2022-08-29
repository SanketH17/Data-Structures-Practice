package Stack_Problems;

import java.util.*;
import java.util.Stack;

public class P08_ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int f = 1;
        if (n < 0) {
            f = -1;
            n = n * (-1);
        }

        Stack<Integer> st = new Stack<>();

        while (n != 0) {
            st.push(n % 10);
            n = n / 10;
        }

        int reverse = 0;
        int i = 1;
        while (!st.isEmpty()) {
            reverse = reverse + (st.peek() * i);
            st.pop();
            i = i * 10;
        }

        if(f == -1) {
            reverse = reverse * (-1);
        }
        System.out.println(reverse);
        sc.close();
    }
}
