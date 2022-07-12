package M04_Arrays_2D;



import java.util.*;

/*

n = 5
1  2   3  4  5
6  7   8  9 10
11 12 13 14 15
21 22 23 24 25
31 32 33 34 35

gap = 0 

i j
0 0
1 1
2 2
3 3
4 4
5 5 -> gap = 1

0 1
1 2
2 3
3 4
4 5 -> gap = 2

0 2
1 3
2 4
3 5 -> gap = 3

0 3
1 4
2 5 -> gap = 4

0 4
1 5 -> gap = 5 -> terminate

output : 
1
7
13
24
35
2
8
14
25
3
9
15
4
10
5
 */


public class PrintUpperTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int gap = 0; gap < n; gap++){
            for(int i = 0, j = gap; j < n; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
        sc.close();
    }
}