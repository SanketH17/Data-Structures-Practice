package PepCoding_DSA.M6_Recursion_and_BackTracking.M3_Recursion_in_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;





public class p2_GetKeypadCombination {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    ArrayList<String> words = getKPC(str);

    System.out.println(words);

    sc.close();

    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno","pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {


        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        // str : 678
        char ch = str.charAt(0); // 6
        String ros = str.substring(1); // 78
        ArrayList<String> rres = getKPC(ros); // 6 words of 78

        ArrayList<String> mres = new ArrayList<>(); // 24 words of 678

        String codeforch = codes[ch - '0'];

        for(int i = 0; i < codeforch.length(); i++){
            char chcode = codeforch.charAt(i);
            for(String rstr : rres){
                mres.add(chcode + rstr);
            }
        }

        return mres;

    }
}
