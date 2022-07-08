package M6_Recursion_and_BackTracking.M4_Recursion_on_the_way_up;

import java.util.*;

public class p6_PrintPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");
        sc.close();
    }
    // asf - answer so far
    // qlpart = ques left part
    // qrpart = ques right part
    // roq = rest of the string
    public static void printPermutations(String ques, String asf) {
        
        if(ques.length() == 0){
            System.err.println(asf);
            return;
        }

        for(int i = 0; i < ques.length(); i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0, i);
            String qrpart = ques.substring(i + 1);
            String roq = qlpart + qrpart;
            printPermutations(roq, asf + ch);
        }

    }
}
