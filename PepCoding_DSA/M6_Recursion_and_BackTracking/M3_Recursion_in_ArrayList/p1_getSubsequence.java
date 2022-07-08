package M6_Recursion_and_BackTracking.M3_Recursion_in_ArrayList;


/*

input : str - > abc 

subsequences : 
_ _ _
_ _ c
_ b _ 
_ b c
a _ _ 
a _ c
a b _
a b c

 */


import java.util.*;

public class p1_getSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res;
        res = gss(str);
        System.out.println(res);

        sc.close();
    }


    // Faith : bc -> [--, -c, b-, bc]
    // Exp : abc -> [---, --c, -b-, -bc, a--, a-c, ab-, abc]
    public static ArrayList<String> gss(String str){

        // eg. str = abc

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(""); //bres = blank result
            return bres;
        }
        char ch = str.charAt(0); // a
        String ros = str.substring(1); // bc, ros -> rest of the string
        ArrayList<String> rres = gss(ros); // rres -> recursion result => bc -> [--, -c, b-, bc]


        ArrayList<String> mres = new ArrayList<>(); // mres -> my result
        for(String rstr : rres){
            mres.add("" + rstr);
        }
        for(String rstr : rres){
            mres.add(ch + rstr);
        }

        return mres;

    }
}
