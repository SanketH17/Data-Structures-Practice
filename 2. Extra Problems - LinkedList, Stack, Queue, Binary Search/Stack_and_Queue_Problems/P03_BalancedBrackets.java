package Stack_and_Queue_Problems;

import java.util.*;
import java.util.Stack;

/*
Input : 2
()
Output : YES

3
()[
NO

*/


public class P03_BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        if (n == 0) {
            System.out.println("NO");
        }

        boolean ans = balancedBrackets(s, n);

        if (ans == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

    static boolean balancedBrackets(String s, int n) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < n; i++) {
            char currChar = s.charAt(i);

            if (currChar == '(' || currChar == '{' || currChar == '[') {
                st.push(currChar);
            } else {
                // currChar is a closing brace
                if (st.isEmpty()) {
                    return false;
                }

                // try to match the brackets
                if (currChar == ')' && st.peek() == '(') {
                    // this means there is a match
                    st.pop();
                    continue;
                } else if (currChar == '}' && st.peek() == '{') {
                    // this means there is a match
                    st.pop();
                    continue;
                } else if (currChar == ']' && st.peek() == '[') {
                    // this means there is a match
                    st.pop();
                    continue;
                }

                // when nothing matches
                return false;

            }
        }

        return st.isEmpty();
    }

}
