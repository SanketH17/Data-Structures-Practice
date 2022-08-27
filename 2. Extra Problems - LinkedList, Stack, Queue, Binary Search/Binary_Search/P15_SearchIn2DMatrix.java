package Binary_Search;
import java.util.Scanner;

public class P15_SearchIn2DMatrix {

    static int rowAns, colAns;

    public static void search(int[][] mat, int x) {
        int n = mat.length; // row length 
        int row = 0, col = mat[0].length - 1;

        while(row < n && col >= 0) {

            if(mat[row][col] == x) {
                // we have found the value
                // update the ans here
                rowAns = row;
                colAns = col;
                break;
            }

            if(mat[row][col] > x) {
                // go left
                col--;
            } else {
                // go down
                row++;
            }

        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {

            rowAns = -1; colAns = -1;

            int n = sc.nextInt();
            int x = sc.nextInt();
            int[][] mat = new int[n][n];

            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    mat[j][k] = sc.nextInt();
                }
            }
            search(mat, x);
            System.out.println(rowAns + " " + colAns);
        }
        sc.close();
    }
}
