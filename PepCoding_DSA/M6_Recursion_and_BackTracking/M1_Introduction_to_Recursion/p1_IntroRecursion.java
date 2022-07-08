package M6_Recursion_and_BackTracking.M1_Introduction_to_Recursion;

public class p1_IntroRecursion {
    public static void main(String[] args) {
        

        PD(4);

    }

    public static void PD(int n)
    {
        if(n == 0)
            return;
        System.out.println(n);
        PD(n - 1);
    }
}
