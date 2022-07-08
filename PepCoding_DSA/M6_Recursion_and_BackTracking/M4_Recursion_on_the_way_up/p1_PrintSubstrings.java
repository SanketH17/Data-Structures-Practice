package M6_Recursion_and_BackTracking.M4_Recursion_on_the_way_up;

import java.util.*;

public class p1_PrintSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        printSS(str, "");
        sc.close();
    }

    public static void printSS(String ques, String ans){

        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq, ans + ch);
        printSS(roq, ans + "");

    }

}
