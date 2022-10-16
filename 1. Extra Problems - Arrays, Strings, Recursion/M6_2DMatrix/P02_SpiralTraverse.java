package M6_2DMatrix;

import java.util.*;

public class P02_SpiralTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // row
        int n = sc.nextInt(); // col

        int[][] arr = new int[m][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[] b = new int[m * n];

        int x = 0, i = 0, j = 0, dir = 0, up = 0, down = m - 1, left = 0, right = n - 1;
        
        while (x < m * n) {
            while(i <= down && j <= right && j >= left && i >= up) {
                b[x] = arr[i][j];
                x++;

                if(dir == 0) {
                    j++; // left -> right
                } else if (dir == 1) {
                    i++; // top -> down
                } else if (dir == 2) {
                    j--; // right -> left
                } else if (dir == 3) {
                    i--; // down -> up
                }

            }
            if(dir == 0) { up++; i++; j--; }
            else if (dir == 1) { right--; j--; i--; }
            else if (dir == 2) { down--; i--; j++; }
            else if (dir == 3) { left++; j++; i++; }
            dir = (dir + 1) % 4;
        }

        // at last printing all elements stored in array - b.
        for(x = 0; x < m * n; x++) {
            System.out.println(b[x] + " ");
        }
        
    }    
}
