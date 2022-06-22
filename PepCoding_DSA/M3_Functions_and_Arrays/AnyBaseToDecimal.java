package PepCoding_DSA.M3_Functions_and_Arrays;


import java.util.Scanner;
//
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // given number
        int b = scn.nextInt(); //info about given number's base 

        System.out.println(getValueinDecimal(n, b));
        scn.close();
    }

    public static int getValueinDecimal(int n, int b){
        int decimal = 0;

        int multiplier = 1;
        while(n > 0){
            int dig = n % 10;
            n = n / 10; // divided by destination base
            decimal += dig * multiplier; 
            multiplier = multiplier * b; //multiply by given base
        }

        return decimal;
    }
}
