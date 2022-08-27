package Stack_Problems;

import java.util.*;
import java.util.Stack;

public class P06_ReverseStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            st.push(ch);
        }

        String ans = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = st.pop();
            ans += ch;
        }

        System.out.println(ans);

        sc.close();

    }
}
