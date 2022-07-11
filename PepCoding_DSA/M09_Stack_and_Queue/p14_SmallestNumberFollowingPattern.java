package M09_Stack_and_Queue;

import java.util.*;

public class p14_SmallestNumberFollowingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();
        // code
        Stack <Integer> st = new Stack<>();
        int num = 1;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'd'){
                st.push(num);
                num++;
            }
            else{
                st.push(num);
                num++;

                while(st.size() > 0){
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while(st.size() > 0){
            System.out.print(st.pop());
        }

    }
}
