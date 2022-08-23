package ProblemSolving.M2_Loops_and_Arrays.Arrays;

import java.util.*;;

public class p08_SearchInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int res = solve(arr, n, k);
        System.out.println(res);
        sc.close();
    }

    public static int solve(int[] arr, int n, int k) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == k) {
                return i;
            } else if (arr[i] > k) {
                return i;
            }
        }
        return n;
    }

}
