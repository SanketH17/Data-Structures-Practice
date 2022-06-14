package PepCoding_DSA.String_and_ArrayList;

import java.util.*;

public class p10_ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));
        sc.close();
    }

    public static String toggleCase(String str){

        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch >= 'a' && ch <= 'z'){ // lower to uppercase
                char uch = (char)('A' + ch - 'a');
                sb.setCharAt(i, uch);
            }
            else if(ch >= 'A' && ch <= 'Z'){ //upper to lowercase
                char lch = (char)('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }

        return sb.toString();

    }
}
