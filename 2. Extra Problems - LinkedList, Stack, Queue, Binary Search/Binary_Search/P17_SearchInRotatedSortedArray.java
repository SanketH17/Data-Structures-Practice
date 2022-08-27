package Binary_Search;
import java.util.Scanner;

public class P17_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = search(arr, x);
        System.out.println(ans);

        sc.close();
    }

    public static int search(int[] arr, int target) {
        int ans = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            // if mid is in original region and
            // target is in rotated region
            // then move right
            if (arr[mid] >= arr[0] && target < arr[0]) {
                start = mid + 1;
            }

            /*Input :
             9 1
             4 5 6 7 8 9 10 0 1

             Output : 8
             */


            // if mid is in rotated region and
            // target is in original region
            // then move left
            else if (arr[mid] < arr[0] && target >= arr[0]) {
                end = mid - 1;
            }

            else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    ans = mid;
                    break;
                }
            }

        }

        return ans;

    }

}
