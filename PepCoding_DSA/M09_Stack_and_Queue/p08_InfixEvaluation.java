package M09_Stack_and_Queue;

/*

Two stacks will be used
>> one stack will be of operands
>> another stack will be of operators

operands -> pushes into the stack
(        -> pushes into the operators stack
)        -> pop till '('
operator -> pop equal or highest priority operators from the stack till 
size of stack becomes zero || till the smaller priority element occurs
and then pushes itself

*/

import java.util.*;

public class p08_InfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        sc.close();
        // code
        // two stacks - one for integers
        // another stack for operators
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) { // traversing through expression
            char ch = exp.charAt(i);

            if (ch == '(') { // if opening brace - push into operators stack
                optors.push(ch);
            }

            else if (Character.isDigit(ch)) { // if operand(digits or numbers) - push into operand stack
                opnds.push(ch - '0'); // char to int
            }

            else if (ch == ')') { // if closing brace - pop until encounter ) on top of stack
                while (optors.peek() != '(') {
                    char optor = optors.pop(); // one element pop from operators stack
                    int v2 = opnds.pop(); // two elements pop from operands stack
                    int v1 = opnds.pop();

                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.pop();
            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // ch is wanting higher priority operators to solve first
                while (optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())) {
                    char optor = optors.pop(); // one element pop from operators stack
                    int v2 = opnds.pop(); // two elements pop from operands stack
                    int v1 = opnds.pop();

                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                // ch is pushing itself now
                optors.push(ch);
            }
        }

        while(optors.size() != 0){
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            int opv = operation(v1, v2, optor);
            opnds.push(opv);
        }

        System.out.println(opnds.peek());

    }

    public static int precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') { // + and - have same precedence
            return 1;
        } else if (optor == '*') { // * and / have same precedence but higher than + and -
            return 2;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') { // + and - have same precedence
            return v1 - v2;
        } else if (optor == '*') { // * and / have same precedence but higher than + and -
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }

}
