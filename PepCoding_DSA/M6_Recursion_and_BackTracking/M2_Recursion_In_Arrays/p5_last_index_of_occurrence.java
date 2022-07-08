package M6_Recursion_and_BackTracking.M2_Recursion_In_Arrays;

import java.util.*;

public class p5_last_index_of_occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int li = lastIndex(arr, 0, d);
        System.out.println(li);

        sc.close();
    }


    public static int lastIndex(int[] arr, int idx, int x){

        if(idx == arr.length){
            return -1;
        }

        //liisa = last index in smaller array
        int liisa = lastIndex(arr, idx + 1, x);
        if(liisa == -1){
            if(arr[idx] == x)
                return idx;
            else 
                return -1;
        }
        else{
            return liisa;
        }


    }
}
