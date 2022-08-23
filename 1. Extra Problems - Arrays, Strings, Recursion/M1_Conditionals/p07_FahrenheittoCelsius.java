package ProblemSolving.M1_Conditionals;

import java.util.*;

/*
T(°c) = (T(°f) - 32)*5/9 
*/

public class p07_FahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int F = sc.nextInt();
        int C = (F - 32) * 5 / 9;
        System.out.println(C);
        sc.close();
    }
}
