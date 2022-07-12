package M06_Recursion_and_BackTracking.M1_Introduction_to_Recursion;

public class p4_StringPermutations {
    public static void main(String[] args) {
        
        permutation("abc", "");

    }


    public static void permutation(String ques, String ans){

        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < ques.length(); i++){

           
            String nq = ques.substring(0, i) + ques.substring(i+1);
            permutation(nq, ans + ques.charAt(i));


        }

    }
    
}
