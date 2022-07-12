package M04_Arrays_2D;

import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            
        }


        int x =  sc.nextInt();
        sc.close();
        int i = 0;
        int j = arr[0].length - 1; // top right corner

        while(i < arr.length && j >= 0){ // jab tak i is remaining till bottom and j is remaining till leftmost
            
            if(x == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(x < arr[i][j]){
                j--; // if 
            }else{
                i++;
            }
        }

        System.out.println("not found");
        
        
    }
}
