package M06_Recursion_and_BackTracking.M1_Introduction_to_Recursion;

public class p8_PrintZigZag {
    public static void main(String[] args) {
        pzz(3);
    }

    public static void pzz(int n){
        if(n == 0){
            return;
        }

        System.out.println("Pre" + n);
        pzz(n - 1);
        System.out.println("In" + n);
        pzz(n - 1);
        System.out.println("Post" + n);

    }
}
