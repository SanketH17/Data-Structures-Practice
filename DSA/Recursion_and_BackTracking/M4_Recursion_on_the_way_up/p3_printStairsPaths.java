package PepCoding_DSA.Recursion_and_BackTracking.M4_Recursion_on_the_way_up;

import java.util.*;

public class p3_printStairsPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printStairsPaths(n, "");
        sc.close();
    }

    public static void printStairsPaths(int n, String path ) {
        
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(path);
            return;
        }
        printStairsPaths(n - 1, path + 1);
        printStairsPaths(n - 2, path + 2);
        printStairsPaths(n - 3, path + 3);
    }
}
