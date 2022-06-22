package PepCoding_DSA.M7_Time_and_Space_Complexity;


import java.util.*;
public class p04_MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
        }

        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);
        sc.close();

    }

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
                k++;
            }
            else{
                res[k] = b[j];
                j++;
                k++;
            }

            while(i < a.length){
                res[k] = a[i];
                i++;
                k++;
            }
            while(j < b.length){
                res[k] = b[j];
                j++;
                k++;
            }
        }

        return res;

    }

    public static void print(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
