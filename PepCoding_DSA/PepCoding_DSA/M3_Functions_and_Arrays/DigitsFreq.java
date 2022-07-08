package PepCoding_DSA.M3_Functions_and_Arrays;


import java.util.Scanner;

public class DigitsFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitsFreq(n, d);
        System.out.println(f);
        sc.close();
    }

    public static int getDigitsFreq(int n, int d){
        int rv = 0;

        while(n > 0){
            int dig = n % 10;
            n = n / 10;
            if(dig == d){
                rv++;
            }
        }

        return rv;
    }
}
