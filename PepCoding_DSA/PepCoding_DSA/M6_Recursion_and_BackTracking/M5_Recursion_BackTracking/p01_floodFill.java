package PepCoding_DSA.M6_Recursion_and_BackTracking.M5_Recursion_BackTracking;




/*

input : 


output :
rddr


 */



import java.util.*;


public class p01_floodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//rows
        int m = sc.nextInt();//cols

        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "", visited);
        sc.close();
    }

    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] visited) {
        if (sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1 || visited[sr][sc] == true) {
          return;
        }
        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
          System.out.println(asf);
          return;
        }
        visited[sr][sc] = true;
        floodfill(maze, sr - 1, sc, asf + "t", visited);
        floodfill(maze, sr, sc - 1, asf + "l", visited);
        floodfill(maze, sr + 1, sc, asf + "d", visited);
        floodfill(maze, sr, sc + 1, asf + "r", visited);
        visited[sr][sc] = false; // during coming back from the recursion we have to remove the marked value that is true to false
        







    }
}
