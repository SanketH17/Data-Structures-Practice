package M1_Conditionals;

import java.util.Scanner;

public class p04_BigLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        if(v1 >= v2) {
            System.out.println("false");
        } else {
            int hgap = h1 - h2;
            int rate = v2 - v1;
            if (hgap % rate == 0) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
        sc.close();
    }
}
