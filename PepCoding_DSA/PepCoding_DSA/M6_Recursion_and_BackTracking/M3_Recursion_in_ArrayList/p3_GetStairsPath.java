package PepCoding_DSA.M6_Recursion_and_BackTracking.M3_Recursion_in_ArrayList;



/*

Problem Discussion :
A person is standing on the nth floor of a staircase and wants to come to the 0th floor.
At a time he can go 1, 2 or 3 steps down.
You have to print all the paths that can be used to climb down the staircase.
For example, if n=3, then all the paths are 111, 12, 21, 3.


Set Expectation : We expect that we will get all the paths from n to 0.
Build Faith : We must have faith that if our code can give us all the paths from n to 0, then it can definitely give us all the paths from (n-1) to 0 , 
(n-2) to 0 and (n-3) to 0. You just need to believe. Don"t focus on "HOW" that will happen.
Expectation meets Faith : For printing the desired output for n, we could just add "1" to all the paths for (n-1) , 
"2" to all the paths for (n-2) and "3" to all the paths for (n-3).


 */



import java.util.*;

public class p3_GetStairsPath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairsPaths(n);
        System.out.println(paths);
        sc.close();
    }

    public static ArrayList<String> getStairsPaths(int n){

        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(""); // returning a path which contains nothing i.e. an arraylist which contains [""]
            return bres;
        }
        else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres; // returning nothing i.e. blank
        }

        ArrayList<String> paths1 = getStairsPaths(n - 1);
        ArrayList<String> paths2 = getStairsPaths(n - 2);
        ArrayList<String> paths3 = getStairsPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1){
            paths.add(1 + path);
        }
        for (String path : paths2){
            paths.add(2 + path);
        }
        for (String path : paths3){
            paths.add(3 + path);
        }

        return paths;
    }

}
