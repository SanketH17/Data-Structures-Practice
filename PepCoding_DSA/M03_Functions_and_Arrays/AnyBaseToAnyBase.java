package M03_Functions_and_Arrays;

import java.util.Scanner;

/*

1. You are given a number n.
2. You are given a base b1. n is a number on base b1.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2

*/

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        
        int d = getValue(n, b1, b2);
        System.out.println(d);
        sc.close();
    }

    public static int getValue(int n, int b1, int b2){
        int dec = AnyBaseToDecimal(n, b1);
        int dn = DecimalToAnyBase(dec, b2);
        return dn;
    }

    public static int DecimalToAnyBase(int n, int b) {
        int ans_num = 0, multiplier = 1;
        while (n > 0)
        {
          int remainder = n % b;
          n = n / b;
          ans_num = ans_num + remainder * multiplier;
          multiplier *= 10;
        }
        return ans_num;
      }


    public static int AnyBaseToDecimal(int n, int b){
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
