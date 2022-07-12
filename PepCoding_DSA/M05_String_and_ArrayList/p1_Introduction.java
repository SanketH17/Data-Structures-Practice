package M05_String_and_ArrayList;



import java.util.*;

/*

shortcut key to comment in vs code = Ctrl + K + C

Declaring
Memory
i/p
o/p
charAt()
length
add two string
add at the end of the string
substring
split


In strings you cannot change the value of the character unlike arrays
 */

public class p1_Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String s1 = sc.nextLine();
        // String s2 = sc.next();
        // System.out.println("The string printed by s1 = " + s1);
        // System.out.println("The string printed by s2 = " + s2);

        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        sc.close();
    }
}
