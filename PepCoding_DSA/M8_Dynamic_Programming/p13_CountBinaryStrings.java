
import java.util.*;

public class p13_CountBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int oczeros = 1;
        int ocones = 1;

        for(int i = 2; i <= n; i++){
            int nczeros = ocones;
            int ncones = oczeros + ocones;

            ocones = ncones;
            oczeros = nczeros;
        }

        System.out.println(oczeros + ocones);
        sc.close();
    }   
}

/*

Time Complexity :
The time complexity of this procedure is O(n) where n is the length of an array.

SPACE COMPLEXITY :
Since we have used two integer variables which take constant space, 
instead of two arrays of size n + 1, hence we are able to reduce the space complexity from O(n ) to O(1)since we have not used any extra memory or any extra data structure.



 */