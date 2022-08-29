package Stack_Problems;

import java.util.*;
import java.util.Stack;

public class P10_InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String exp = sc.next();

        sc.close();
        

        Stack<String> postfix = new Stack<>();
        Stack<Character> ops = new Stack<>();

       


        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '(') {
                ops.push(ch);
            } 
            
            else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                postfix.push(ch + "");
            } 
            
            else if (ch == ')') {
                while(ops.peek() != '(') {
                    process(ops, postfix, exp);
                }
                ops.pop(); // pop openenig operator
            } 
            
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(ops.size() > 0 && ops.peek() != '(' && precedene(ch) <= precedene(ops.peek())) {
                    process(ops, postfix, exp);
                }
                ops.push(ch);// push current character
            }
        }

        while(ops.size() > 0) {
            process(ops, postfix, exp);
        }

        System.out.println(postfix.pop());

    }

    public static void process(Stack<Character> ops, Stack<String> postfix, String exp) {
        if(exp.length() == 2) {
            char op = ops.pop();
            String postv2 = postfix.pop();
            String postv = postv2 + op;
            postfix.push(postv);
            return;
        }

        char op = ops.pop();

        String postv2 = postfix.pop();
        String postv1 = postfix.pop();
        String postv = postv1 + postv2 + op;
        postfix.push(postv);
    }

    public static int precedene(char op) {
        if(op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
