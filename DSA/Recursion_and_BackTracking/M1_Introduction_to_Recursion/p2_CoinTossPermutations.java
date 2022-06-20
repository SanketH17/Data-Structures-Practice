package PepCoding_DSA.Recursion_and_BackTracking.M1_Introduction_to_Recursion;

public class p2_CoinTossPermutations {
    public static void main(String[] args) {
        coinToss(3, "");
    }

    public static void coinToss(int n, String ans){

        if(n == 0){
            System.out.println(ans);
            return;
        }
        coinToss(n - 1, ans + " H ");
        coinToss(n - 1, ans + " T ");

    }

}
