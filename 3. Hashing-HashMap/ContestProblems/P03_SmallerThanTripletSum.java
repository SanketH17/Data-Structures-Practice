package ContestProblems;


import java.util.*;


public class P03_SmallerThanTripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int ans = findTriplets(arr, n, target);
        System.out.println(ans);

        sc.close();

    }

    public static int findTriplets(int[] arr, int n, int target) {
        int count = 0, start = 0, sum = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum >= target) {
                count++;
            }
            while(sum >= target) {
                sum -= arr[start];
                start++;
            }
        }
        return count;
    }

}