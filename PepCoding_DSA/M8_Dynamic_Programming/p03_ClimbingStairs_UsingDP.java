
import java.util.*;
public class p03_ClimbingStairs_UsingDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countPaths(n, new int[n + 1]);
        System.out.println(cp);
        sc.close();
    }

    public static int countPaths(int n, int[] qb) {
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        if(qb[n] > 0){
            return qb[n];
        }

        System.out.println("Hello " + n);
        int nm1 = countPaths(n - 1, qb);
        int nm2 = countPaths(n - 2, qb);
        int nm3 = countPaths(n - 3, qb);
        int cp = nm1 + nm2 + nm3;

        qb[n] = cp;

        return cp;
    }
}






/*

Simple recursion program : 


    public static int countPaths(int n) {
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        System.out.println("Hello " + n);
        int nm1 = countPaths(n - 1);
        int nm2 = countPaths(n - 2);
        int nm3 = countPaths(n - 3);
        int cp = nm1 + nm2 + nm3;
        return cp;
    }





    **Recursion using memoization

    public static int countPaths(int n, int[] qb) {
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        if(qb[n] > 0){
            return qb[n];
        }

        System.out.println("Hello " + n);
        int nm1 = countPaths(n - 1, qb);
        int nm2 = countPaths(n - 2, qb);
        int nm3 = countPaths(n - 3, qb);
        int cp = nm1 + nm2 + nm3;

        qb[n] = cp;

        return cp;
    }



 */
