package ProblemSolving.M2_Loops_and_Arrays.Arrays;

import java.util.Scanner;

public class p07_AngryProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt(); // no of students
            int k = sc.nextInt(); // threshold
            int[] arr = new int[n];

            int count = 0;
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if(arr[j] <= 0) {
                    count++;
                }
            }
            if(count >= k) {
                System.out.println("No");
            } else {
                System.out.println("YES");
            }

        }
        sc.close();
        
    }
}
