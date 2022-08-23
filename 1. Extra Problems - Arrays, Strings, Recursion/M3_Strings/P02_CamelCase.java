package ProblemSolving.M3_Strings;

import java.util.*;

public class P02_CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(countWords(s));

        sc.close();
    }

    public static int countWords(String str) {

        if(str.length() == 0) {
            return 0;
        }

        int count = 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                count++;
            }
        }

        return count;

    }

}
