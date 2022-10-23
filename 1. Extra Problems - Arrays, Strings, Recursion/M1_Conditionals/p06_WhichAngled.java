package M1_Conditionals;

import java.util.*;

public class p06_WhichAngled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int maxside;
        if(s1 > s2 && s1 > s3) {
            maxside = s1;
        } else if (s2 > s3) {
            maxside = s2;
        } else {
            maxside = s3;
        }

        int alsqs = s1 * s1 + s2 * s2 + s3 * s3; // all side squares sum;
        if(2 * maxside * maxside < alsqs) {
            System.out.println("Acute angled triangle");
        } else if (maxside * maxside > alsqs) {
            System.out.println("Obtuse angled triangle");
        } else {
            System.out.println("Right angled triangle");
        }
        sc.close();
    }
}
