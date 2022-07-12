package M03_Functions_and_Arrays;

import java.util.Scanner;
// n2 > n1
public class AnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        sc.close();
    }

    public static int getDifference(int b, int n1, int n2){
        int rv = 0;

        int c = 0;
        int p = 1;
        while(n2 > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = 0;
            d2 = d2 + c;
            
            if(d2 >= d1){
                c = 0;
                d = d2 - d1;
            }
            else{
                c = -1;
                d = d2 + b - d1;
            }

            rv = rv + d * p; //just for arranging the digits we multiply by power of 10
            p = p * 10;
        }

        return rv;
    }
}
