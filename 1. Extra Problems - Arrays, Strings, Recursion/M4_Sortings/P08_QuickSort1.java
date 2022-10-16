package M4_Sortings;

import java.util.*;

public class P08_QuickSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] b = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] < arr[0]) {
                b[k] = arr[i];
                k++;
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] == arr[0]) {
                b[k] = arr[i];
                k++;
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] > arr[0]) {
                b[k] = arr[i];
                k++;
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
