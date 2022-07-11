package M09_Stack_and_Queue;

import java.util.*;

public class p11_Prefix_Evaluation_and_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        sc.close();
        // code
        Stack <Integer> valueStack = new Stack<>();
        Stack <String> infixStack = new Stack<>();
        Stack <String> postfixStack = new Stack<>();

        for(int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                // Calculating value in value stack and pushing it back into same 
                int v1 = valueStack.pop();
                int v2 = valueStack.pop();
                int val = operation(v1, v2, ch);
                valueStack.push(val);

                // calculating infix expression
                String inv1 = infixStack.pop();
                String inv2 = infixStack.pop();
                String inval = "(" + inv1 + ch + inv2 + ")" ;
                infixStack.push(inval);


                // calculating postfix evaluation
                String postv1 = postfixStack.pop();
                String postv2 = postfixStack.pop();
                String postval = postv1 + postv2 + ch;
                postfixStack.push(postval);
            }
            else{
                valueStack.push(ch - '0');   // valuestck is of type integer so converting string char to int
                infixStack.push(ch + "");    // char + string = string
                postfixStack.push(ch + "");  // '' + " " = " "
            }
        }

        System.out.println(valueStack.pop());
        System.out.println(infixStack.pop());
        System.out.println(postfixStack.pop());


    }

    public static int operation(int v1, int v2, char op) {
        if(op == '+'){
            return v1 + v2;
        }
        else if(op == '-'){
            return v1 - v2;
        }
        else if(op == '*'){
            return v1 * v2;
        }
        else{
            return v1 / v2;
        }
    }

}
