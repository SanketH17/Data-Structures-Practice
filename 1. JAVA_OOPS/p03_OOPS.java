public class p03_OOPS {

    public static class sum{

        sum(int a, int b) {
            System.out.println("Addition = " + ( a + b));
        }

        sum(int a, int b, int c) {
            System.out.println("Addition = " +(a + b + c));
        }

        sum(int a, int b, int c, int d) {
            System.out.println("Addition = " +(a + b + c + d));
        }

    }


    public static void main(String[] args) {
        sum s1 = new sum(10, 20);
        sum s2 = new sum(10, 20, 30);
        sum s3 = new sum(10, 20, 30, 40);
    }

}
