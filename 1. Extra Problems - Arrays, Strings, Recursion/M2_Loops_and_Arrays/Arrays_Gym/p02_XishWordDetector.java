package M2_Loops_and_Arrays.Arrays_Gym;

import java.util.*;

public class p02_XishWordDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String xstring = sc.next();
        String ans = "";
    
        for(int i = 0; i < xstring.length(); i++) {
            char xch = xstring.charAt(i);
            for(int j = 0; j < word.length(); j++) {
                if(xch == word.charAt(j)) {
                    ans += xch;
                    break;
                }
            }
        }
        if(ans.equals(xstring)) { //s1.equals(s2)
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
