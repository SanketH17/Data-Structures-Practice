package M5_Recursion;



public class P01_FibSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n == 1) {
            return 0;
        } 
        if (n == 2) {
            return 1;
        }
        int ans = fib(n - 1) + fib(n - 2);
        return ans;
    }
}
