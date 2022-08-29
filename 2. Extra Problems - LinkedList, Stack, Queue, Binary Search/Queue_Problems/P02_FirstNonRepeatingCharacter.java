package Queue_Problems;

import java.util.*;
import java.util.Queue;

public class P02_FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();
        
        int[] freq = new int[26];

        Queue<Character> q = new LinkedList<Character>();

        for(int i = 0; i < str.length; i++) {
            char ch = str[i];
            q.add(ch); // add character in queue
            freq[ch - 'a']++;

            while(!q.isEmpty()) {
                if(freq[q.peek() - 'a'] > 1) { // if freq count of any character in freq array is more than 1 then remove all those chars from the quue
                    q.remove();
                } else {
                    System.out.print(q.peek());
                    break;
                }
            }
            if(q.isEmpty()) {
                System.out.print("#");
            }
        }
        sc.close();

    }
}
