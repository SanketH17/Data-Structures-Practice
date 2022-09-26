import java.util.Scanner;

public class FindHingedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findHingedElement(arr, n);
        System.out.println(ans);
        sc.close();
    }

    public static int findHingedElement(int[] arr, int n) {
        {
            // leftMax[i] stores maximum of arr[0..i-1]
            int[] leftMax = new int[n];
            leftMax[0] = Integer.MIN_VALUE;

            // Fill leftMax[1..n-1]
            for (int i = 1; i < n; i++)
                leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);

            // Initialize minimum from right
            int rightMin = Integer.MAX_VALUE;

            // Traverse array from right
            for (int i = n - 1; i >= 0; i--) {
                // Check if we found a required element
                if (leftMax[i] < arr[i] && rightMin > arr[i])
                    return i;

                // Update right minimum
                rightMin = Math.min(rightMin, arr[i]);
            }

            // If there was no element matching criteria
            return -1;

        }
    }

}
