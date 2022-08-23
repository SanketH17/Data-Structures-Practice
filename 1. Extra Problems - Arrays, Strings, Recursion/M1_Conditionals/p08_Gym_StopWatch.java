package ProblemSolving.M1_Conditionals;

import java.util.*;

public class p08_Gym_StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] watch = new int[n];
        for(int i = 0; i < watch.length; i++){
            watch[i] = sc.nextInt();
        }
        sc.close();
        
        int timeSum = 0;
        if(watch.length % 2 != 0) {
            System.out.println("Still running");
            return;
        } else {
            
            for(int i = watch.length - 1; i >= 0; i = i - 2) {
                timeSum = timeSum + (watch[i] - watch[i-1]);
            }
        }
        System.out.println(timeSum);
        sc.close();
    }
}
