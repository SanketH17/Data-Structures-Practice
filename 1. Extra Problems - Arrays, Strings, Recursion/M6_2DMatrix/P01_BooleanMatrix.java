package ProblemSolving.M6_2DMatrix;

import java.util.*;

public class P01_BooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1) {
                    for(int k = 0; k < arr[0].length; k++) {
                        arr[i][j] = 1;
                    }
                }
            }
        }

        print(arr);
        sc.close();

    }

    public static void print(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
