package PepCoding_DSA.Arrays_2D;

import java.util.*;

public class RotateMatrix90ByDigrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //transpose of matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reversing each row to rotate the array
        for(int i = 0; i < arr.length; i++){
            int li = 0;
            int ri = arr[i].length - 1;
            while(li <= ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp; 

                li++; ri--;
            }
        }
        System.out.println();
        display(arr);
        sc.close();

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
