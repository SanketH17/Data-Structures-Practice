package M06_Recursion_and_BackTracking.M4_Recursion_on_the_way_up;

import java.util.*;

public class p4_MazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PrintPathsOfMaze(1, 1, n, m, "");
        sc.close();
    }

    public static void PrintPathsOfMaze(int sr, int sc, int dr, int dc, String psf) {
        
        if(sr > dr || sc > dc)
            return;

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        PrintPathsOfMaze(sr, sc + 1, dr, dc, psf + "h");
        PrintPathsOfMaze(sr + 1, sc, dr, dc, psf + "v");

    }
}
