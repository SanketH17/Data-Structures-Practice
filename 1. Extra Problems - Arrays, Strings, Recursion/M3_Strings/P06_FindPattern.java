package M3_Strings;

import java.util.*;

public class P06_FindPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next(); // is s1 present sequentially or not
        String s2 = sc.next();

        int s1l = s1.length();
        boolean flag = false;
        for(int i = 0; i < s2.length() - s1l; i++) {
            if(s1.equals(s2.substring(i, i + s1l))) {
                flag = true;
                break;
            }
        }

        if(flag)
            System.out.println("YES");
        else 
            System.out.println("NO");

        
        sc.close();

    }
}


















