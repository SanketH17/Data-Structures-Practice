

public class P02_SumOfDigits {
    public static void main(String[] args) {
        int n = 1856;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if(n == 0) {
            return 0;
        }

        return n % 10 + sum(n / 10);
    }
}
