package M4_Sortings;

import java.util.Arrays;

public class P04_Merging {
    public static void main(String[] args) {
        int []A = {2,10,18,20,23};
		int []B = {2,4,9,10,18,25,45,55};
        int m = A.length;
        int n = B.length;
        int[] C = new int[m + n];
        merge(A, B, C);
        System.out.println(Arrays.toString(C));
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]) {
                c[k] = a[i];
                i++;k++;
            } else {
                c[k] = b[j];
                k++;j++;
            }
        }

        while(i < a.length) {
            c[k] = a[i];
            i++;k++;
        }
        while(j < b.length) {
            c[k] = b[j];
            k++; j++;
        }
        return;
    }

}





