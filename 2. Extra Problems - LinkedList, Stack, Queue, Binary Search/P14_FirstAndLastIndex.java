import java.util.*;

public class P14_FirstAndLastIndex {
    public static void main(String[] args) throws java.lang.Exception {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int data = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding first index
        int low = 0;
        int high = arr.length - 1;
        int first_index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < arr[mid]) {
                high = mid - 1;
            } else if (data > arr[mid]) {
                low = mid + 1;
            } else {
                first_index = mid; // temporarily setting first_index as mid and then checking in left side if
                                   // there is more data elements
                high = mid - 1;
            }
        }

        // Finding last index
        low = 0;
        high = arr.length - 1;
        int last_index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < arr[mid]) {
                high = mid - 1;
            } else if (data > arr[mid]) {
                low = mid + 1;
            } else {
                last_index = mid; // temporarily setting first_index as mid and then checking in left side if
                                  // there is more data elements
                low = mid + 1;
            }
        }
        System.out.println(first_index + " " + last_index);
        // System.out.println(last_index);
        sc.close();
    }

}