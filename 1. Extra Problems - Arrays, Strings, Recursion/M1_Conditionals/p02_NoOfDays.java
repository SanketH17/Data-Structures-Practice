package M1_Conditionals;

import java.util.*;

public class p02_NoOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close();

        switch(month) {
            case 1 : System.out.println("31"); // jan
            break;
            case 2 : System.out.println("28"); // feb
            break;
            case 3 : System.out.println("31"); // mar
            break;
            case 4 : System.out.println("30"); //apr
            break;
            case 5 : System.out.println("31"); // may
            break;
            case 6 : System.out.println("30"); // june
            break;
            case 7 : System.out.println("31"); // july
            break;
            case 8 : System.out.println("31"); // aug
            break;
            case 9 : System.out.println("30"); //sept
            break;
            case 10 : System.out.println("31"); // oct
            break;
            case 11 : System.out.println("30"); // nov
            break;
            case 12 : System.out.println("31"); // dec
            break;
            default :
            System.out.println("Invalid input");
        }

    }
}
