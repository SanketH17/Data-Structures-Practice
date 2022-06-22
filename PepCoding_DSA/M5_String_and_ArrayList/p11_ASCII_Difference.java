package PepCoding_DSA.M5_String_and_ArrayList;


import java.util.*;
/*

i/p : a s d f g h
o/p : a18 s-15 d2 f1 g1 h

 */
public class p11_ASCII_Difference {


    public static String solution(String str){
        StringBuilder sb = new StringBuilder(); // Defining an empty String Builder
        sb.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++){

            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            int gap = curr - prev;

            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
        sc.close();
    }
}
