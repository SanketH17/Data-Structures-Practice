package M2_Loops_and_Arrays.Arrays;

public class p07_ArmStrongNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 500; i++) {
            if(isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }    

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int rem;
        int temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if(temp == sum) {
            return true;
        } else {
            return false;
        }
    }
}
