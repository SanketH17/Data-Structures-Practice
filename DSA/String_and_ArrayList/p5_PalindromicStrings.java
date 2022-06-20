package PepCoding_DSA.String_and_ArrayList;

import java.util.*;

/*

Str = abccbc

ss = 
a (Palindrome)
ab 
abc
abcc
abccb
abccbc

b (Palindrome)
bc
bcc
bccb (Palindrome)
bccbc

c (Palindrome)
cc (Palindrome)
ccb
ccbc

c (Palindrome)
cb
cbc (Palindrome)

b (Palindrome)
bc

c (Palindrome)


 */

public class p5_PalindromicStrings {

    public static boolean isPalindrome(String s){
        int i = 0; //start index
        int j = s.length() - 1; // last index
        while(i <= j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2)
                return false;
            else
                i++; j--;
        }
        return true;
    }

    public static void solution(String s){
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String ss = s.substring(i, j); // Getting all the substrings 
                if(isPalindrome(ss) == true){ // Checking if the substring is a Palindrome or not
                    System.out.println(ss);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
        sc.close();
    }
}
