package ProblemSolving.M3_Strings;

import java.util.*;

public class P03_NumberString { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int x = sc.nextInt();
        int n = str.length();

        char[] s = str.toCharArray();

        int i = 0; int swap = 0; boolean flag = false;

        while(i < n - 1 && swap < x) {
            int index = i;
            for(int j = i + 1; j < n; j++) {
                if(s[j] > s[i]) {
                    flag = true;
                    if(s[index] < s[j]) {
                        index = j;
                    }
                }
            }

            if(flag == true) {
                char temp = s[i];
                s[i] = s[index];
                s[index] = temp;
                swap++;
                flag = false;
            }
            i++;
        }
        if(s[0] == '0') {
            System.out.println("0");
        } else {
            String result = new String(s);
            System.out.println(result);
        }
        sc.close();
    }


}
