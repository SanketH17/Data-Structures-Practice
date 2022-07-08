package M6_Recursion_and_BackTracking.M3_Recursion_in_ArrayList;

/*
ms - move size
sr = source row
sc = source column
dr = destination row
dc = destination column
*/

import java.util.*;

public class p5_GetMazePathsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList<String> paths = getMazeJumpsPaths(1, 1, n, m);
        System.out.println(paths);
        sc.close();
    }

    public static ArrayList<String> getMazeJumpsPaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        //horizontal moves 
        for(int ms = 1; ms <= dc - sc; ms++){
            ArrayList<String> hpaths = getMazeJumpsPaths(sr, sc + 1, dr, dc);
            for(String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }


        //vertical moves 
        for(int ms = 1; ms <= dr - sr; ms++){
            ArrayList<String> vpaths = getMazeJumpsPaths(sr + 1, sc, dr, dc);
            for(String vpath : vpaths){
                paths.add("v" + ms + vpath);
            }
        }

        //diagonal moves 
        for(int ms = 1; ms <= dr - sr & ms <= dc - sc; ms++){
            ArrayList<String> dpaths = getMazeJumpsPaths(sr + 1, sc + 1, dr, dc);
            for(String dpath : dpaths){
                paths.add("d" + ms + dpath);
            }
        }

        return paths;

    }

}
