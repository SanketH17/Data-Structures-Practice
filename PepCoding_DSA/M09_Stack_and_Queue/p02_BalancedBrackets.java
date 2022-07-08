package M09_Stack_and_Queue;

import java.util.*;

public class p02_BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }

            else if(ch == ')'){
               boolean val = handleClosing(st, '(');
               if(val == false){
                System.out.println(val);
                return;
               }
            }

            else if(ch == '}'){
                boolean val = handleClosing(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                   }
            }

            else if(ch == ']'){
                boolean val = handleClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                   }
            }

            else{

            }

        }

        if(st.size() == 0){
            System.out.println("true");
        }
        else{
             System.out.println("false");
        }

        
    }

    public static boolean handleClosing(Stack<Character> st, char corr_char) {
        if(st.size() == 0){
            return false;
        }    
        else if(st.peek() != corr_char){
            return false;
        }
        else{
            st.pop();
            return true;
        }
    }



}
