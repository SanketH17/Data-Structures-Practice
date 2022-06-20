package PepCoding_DSA.Recursion_and_BackTracking.M1_Introduction_to_Recursion;

public class p3_ClimbingStairCases {
    public static void main(String[] args) {
        
        climbingStairs(0, 5, "");
        
    }

    public static void climbingStairs(int curr, int n, String ans){

        if(curr == n){
            System.out.println(ans);
            return;
        }

        if(curr > n)
            return;

        climbingStairs(curr + 1, n, ans + "1");
        climbingStairs(curr + 2, n, ans + "2");
        climbingStairs(curr + 3, n, ans + "3");

    }

}
