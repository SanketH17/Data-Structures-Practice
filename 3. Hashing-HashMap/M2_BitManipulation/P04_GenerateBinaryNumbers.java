package M2_BitManipulation;

import java.util.*;

public class P04_GenerateBinaryNumbers {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateBinary(n);
        sc.close();
    }

    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<String>();

        q.add("1");

        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.print(s1 + " ");

            String s2 = s1;

            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }
}