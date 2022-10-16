package M4_Sortings;

import java.util.*;

public class P09_QuickSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, n);
        sc.close();
    }

    public static int[] quickSort(int[] a, int n) {
        if(n <= 1) 
            return a;
        int pivot = a[0];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] < pivot)
                cnt++;
        }

        int[] left = new int[cnt];
        int[] right = new int[n - cnt - 1];

        int k = 0;
        for(int i = 1; i < n; i++) {
            if(a[i] < pivot) {
                left[k] = a[i];
                k++;
            }
        }

        k = 0;
        for(int i = 1; i < n; i++) {
            if(a[i] >= pivot) {
                right[k] = a[i];
                k++;
            }
        }

        left = quickSort(left, cnt);
        right = quickSort(right, n - cnt - 1);

        k = 0;
        for(int i = 0; i < cnt; i++) {
            a[k] = left[i];
            k++;
        }
        a[k++] = pivot;

        for(int i = 0; i < n - cnt - 1; i++) {
            a[k] = right[i];
            k++;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return a;
    }
}
