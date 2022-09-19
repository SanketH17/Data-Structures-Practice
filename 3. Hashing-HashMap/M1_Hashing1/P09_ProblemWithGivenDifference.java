import java.util.*;

public class P09_ProblemWithGivenDifference {

    public static boolean findDiff(int n, int[] arr, int diff) {
        HashSet<Integer> mySet = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(mySet.contains(num - diff) == true || mySet.contains(num + diff) == true) {
                return true;
            }
            mySet.add(num);
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int diff = sc.nextInt();

        boolean ans = findDiff(n, arr, diff);

        if(ans)
            System.out.println(1);
        else 
            System.out.println(0);
        sc.close();
    }
}
