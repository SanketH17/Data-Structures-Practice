package M8_Dynamic_Programming;


import java.util.*;
public class p14_ArrangeBuildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long ob = 1;
        long os = 1;
        // ob = old building
        // os = old space
        // nb = new building
        // ns = new space
        for(int i = 2; i <= n; i++){
            long nb = os;
            long ns = ob + os;

            os = ns;
            ob = nb;
        }

        long total = os + ob;
        total = total * total;
        System.out.println(total);

        sc.close();

    }
}
