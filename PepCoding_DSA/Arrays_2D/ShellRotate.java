package PepCoding_DSA.Arrays_2D;

import java.util.Scanner;
import java.util.*;

public class ShellRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int s = sc.nextInt();
        int r = sc.nextInt();

        rotateShell(arr, s, r);
        display(arr);
        sc.close();
    }

    public static void rotateShell(int[][] arr, int s, int r){
        int[] oned = fillOnedFromShell(arr,s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }

    public static void fillOnedFromShell(int[][] arr, int s, int r){
        int minr = s - 1;
        int minc = s -1;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        int size = 2 * (maxr - minr + maxc - minc);

        int[] oned = new int[size];

        //lw
        for(int i = minr, j = minc; i <= maxr; i++){

        }

        //bw
        for(int i = maxr, j = minc; j <= maxc; j++){

        }

        //rw
        for(int i = maxr, j = maxc; i >= minr; i--){

        }

        //tw
        for(int i = minr, j = minc; i <= maxr; i++){

        }


    }

    public static void rotate(int[] a, int r){
        r = r % a.length;
        if(r < 0){
            r = r + a.length;
        }
        
        for(int i = 0; i < a.length; i++){
            int newIndex = (i + r) % a.length;
            a[newIndex] = a[i];
        }
    }






    public static void display(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
