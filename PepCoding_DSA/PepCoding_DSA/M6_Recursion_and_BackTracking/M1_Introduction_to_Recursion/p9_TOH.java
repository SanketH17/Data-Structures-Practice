package PepCoding_DSA.M6_Recursion_and_BackTracking.M1_Introduction_to_Recursion;


/*

if TOH knows how to print the instructions to move 2 disks (from source
to destination)
Then can we make TOH to print the instructions to move 3 disks ?


 */

 import java.util.*;
public class p9_TOH {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sourceTower = sc.nextInt();
        int destinationTower = sc.nextInt();
        int helperTower = sc.nextInt();
        TOH(n, sourceTower, destinationTower, helperTower);
        
        sc.close();

    }


    public static void TOH(int n, int source, int destination, int helper){

        if(n == 0){
            return;
        }
        TOH(n - 1, source, helper, destination); // move n - 1 disks from source to helper using destination
        System.out.println(n + " [ " + source + " -> " + destination + " ] "); // move nth disk from source to destination 
        TOH(n - 1, helper, destination, source); // move n - 1 disks from helper to destination using source

    }   
    
}
