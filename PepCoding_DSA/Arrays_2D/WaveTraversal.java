package PepCoding_DSA.Arrays_2D;

import java.util.*;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); //rows
        int m = sc.nextInt(); //cols
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int j = 0; j < arr[0].length; j++){
            if(j % 2 == 0){
                for(int i = 0; i < arr.length; i++)
                    System.out.println(arr[i][j]);
            }
            else{
                for(int i = arr.length - 1; i >= 0; i--)
                    System.out.println(arr[i][j]);
            }
        }

        sc.close();
    }
}
