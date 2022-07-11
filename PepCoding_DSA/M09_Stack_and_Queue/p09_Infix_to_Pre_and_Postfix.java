package M09_Stack_and_Queue;


/*

Sample Input :
a*(b-c+d)/e

Sample Output :
abc-d+*e/
/*a+-bcde

 */

import java.util.*;

public class p09_Infix_to_Pre_and_Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        sc.close();
        // code
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            }


            // push into pre and postfix stacks
            else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { 
                post.push(ch + ""); // "" + char = string
                pre.push(ch + "");
            }


            else if (ch == ')') {
                while (ops.peek() != '(') {
                    char op = ops.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);


                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2;
                    pre.push(prev);
                }
                ops.pop();
            }



            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (ops.size() > 0 &&
                       ops.peek() != '(' &&
                       precedence(ch) <= precedence(ops.peek())) {
                    char op = ops.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);


                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2;
                    pre.push(prev);
                }
                ops.push(ch); // pushing current operator
            } 
        }

        while (ops.size() > 0) {
            char op = ops.pop();

            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv1 + postv2 + op;
            post.push(postv);


            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String prev = op + prev1 + prev2;
            pre.push(prev);
        } 

        System.out.println(post.pop());
        System.out.println(pre.pop());

    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }

    }

}
