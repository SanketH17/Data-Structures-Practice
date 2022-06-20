package PepCoding_DSA.Recursion_and_BackTracking.M4_Recursion_on_the_way_up;

import java.util.*;
/*
ms - move size
sr = source row
sc = source column
dr = destination row
dc = destination column
*/

public class p5_MazePaths_withJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1, 1, n, m, "");
        sc.close();
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        //Jumps horizontally
        for(int ms = 1; ms <= dc - sc; ms++){
            printMazePaths(sr, sc + 1, dr, dc, psf + "h" + ms);
        }

        //Jumps vertically
        for(int ms = 1; ms <= dr - sr; ms++){
            printMazePaths(sr + 1, sc, dr, dc, psf + "v" + ms);
        }

        for(int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++){
            printMazePaths(sr + 1, sc + 1, dr, dc, psf + "d" + ms);
        }




    }
}
