package PepCoding_DSA.Recursion_and_BackTracking.M3_Recursion_in_ArrayList;


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


    public static ArrayList<String> gss(String str){

        // eg. str = abc

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(""); //bres = blank result
            return bres;
        }
        char ch = str.charAt(0); // a
        String ros = str.substring(1); // bc, ros -> rest of the string
        ArrayList<String> rres = gss(ros); // rres -> recursion result


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
