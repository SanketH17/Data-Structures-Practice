package M09_Stack_and_Queue;

/*

Sample Input
264*8/+3-
Sample Output
2
((2+((6*4)/8))-3)
-+2/*6483

 */

import java.util.*;

public class p10_PostfixEvaluation_and_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        sc.close();
        // code
        Stack<Integer> valueStack = new Stack<>();
        Stack<String> infixStack = new Stack<>();
        Stack<String> prefixStack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v2 = valueStack.pop();
                int v1 = valueStack.pop();
                int val = operation(v1, v2, ch);
                valueStack.push(val);

                String iv2 = infixStack.pop();
                String iv1 = infixStack.pop();
                String ival = "(" + iv1 + ch + iv2 + ")" ;
                infixStack.push(ival);

                String pv2 = prefixStack.pop();
                String pv1 = prefixStack.pop();
                String pval =  ch + pv1 + pv2;
                prefixStack.push(pval);


            } else {
                valueStack.push(ch - '0');
                infixStack.push(ch + "");
                prefixStack.push(ch + "");
            }
        }

        System.out.println(valueStack.pop());
        System.out.println(infixStack.pop());
        System.out.println(prefixStack.pop());

    }

    public static int operation(int v1, int v2, char op) {
        if (op == '+') {
            return v1 + v2;
        } else if (op == '-') {
            return v1 - v2;
        } else if (op == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }

}


/*

Time Complexity :
O(n)

This is because a single for loop is used in the program and the rest of the functions of stack use O(1) time.

SPACE COMPLEXITY :
O(n)

We use a stack of space n to run the program hence space complexity is of order n.

 */