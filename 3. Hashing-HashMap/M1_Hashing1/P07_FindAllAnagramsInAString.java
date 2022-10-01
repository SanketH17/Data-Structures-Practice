package M1_Hashing1;

import java.util.*;

/*
Sample Input 1
10
cbaebabacd
3
abc
Sample Output 1
0 6

Output:
Print all the starting indexes p's anagram in s in sorted order
*/
public class P07_FindAllAnagramsInAString {

    public static void findAnagrams(String s, String p) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> pmap = new HashMap<>();

        // 1. Make pattern map and freqMap
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        // 2. Make window map from source same length as pattern length
        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
        }

        int i = p.length();
        String ans = "";
        while (i < s.length()) {
            if (pmap.equals(smap) == true) {
                ans += (i - p.length()) + " ";
            }

            // Character to achieve
            char cha = s.charAt(i);
            smap.put(cha, smap.getOrDefault(cha, 0) + 1);

            // Character to release
            char chr = s.charAt(i - p.length());
            if (smap.get(chr) == 1) {
                smap.remove(chr);
            } else {
                smap.put(chr, smap.get(chr) - 1);
            }
            i++;
        }
        if (pmap.equals(smap) == true) {
            ans += i + " ";
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int m = sc.nextInt();
        String p = sc.next();

        findAnagrams(s, p);

        sc.close();
    }
}
