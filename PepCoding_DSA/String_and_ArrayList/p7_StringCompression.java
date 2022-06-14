package PepCoding_DSA.String_and_ArrayList;

import java.util.*;
/*
 
str = aaabbcccd

o/p : 
abcd
a3b2c3d

 */
public class p7_StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        System.out.println(str);
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        sc.close();
    }


    public static String compression1(String str){
        String s = str.charAt(0) + ""; // initializing an empty string with first char in it
        

        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            int prev = str.charAt(i - 1);

            if(curr != prev){
                s = s + curr;
            }
        }
        return s; // returning unique string s
    }
    

    public static String compression2(String str){
        String s = str.charAt(0) + ""; // initializing an empty string with first char in it
        int count = 1;

        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            int prev = str.charAt(i - 1);

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    s = s + count; // first add count in the string
                    count = 1;
                }
                s = s + curr; // then add current char to the string
            }
        }

        if(count > 1){
            s = s + count;
            count = 1;
        }
        return s;
     
    }
}
