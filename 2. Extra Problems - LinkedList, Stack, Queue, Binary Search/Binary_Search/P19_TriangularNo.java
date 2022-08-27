package Binary_Search;

import java.util.Scanner;

public class P19_TriangularNo {
    
    public static boolean isTriangular(int num) {
        if(num < 0) {
            return false;
        }

        int a = 1;
        int b = 1;
        int c = (-2 * num);
        int D = b*b - 4*a*c; // Determinant

        if(D < 0) {
            return false;
        }

        float root1 = (-b + (float)Math.sqrt(D)) / 2;
        float root2 = (-b - (float)Math.sqrt(D)) / 2;

        if(root1 > 0 && Math.floor(root1) == root1) {
            return true;
        }

        if(root2 > 0 && Math.floor(root2) == root2) {
            return true;
        }

        return false;

    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Boolean ans = isTriangular(num);

        if(ans) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        sc.close();
    }
}
