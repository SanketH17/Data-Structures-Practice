package ProblemSolving.M2_Loops_and_Arrays.Arrays_Gym;



import java.util.*;

public class P07_CountSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int i = 1; i * i < n; i++) {
            if(i * i < n) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}