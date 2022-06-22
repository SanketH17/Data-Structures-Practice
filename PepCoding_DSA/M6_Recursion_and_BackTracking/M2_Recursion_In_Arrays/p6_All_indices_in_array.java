package PepCoding_DSA.M6_Recursion_and_BackTracking.M2_Recursion_In_Arrays;

import java.io.*;


public class p6_All_indices_in_array {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }
        
        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length){
            return new int[fsf];
        }
        
        int[] iarr;

        if(arr[idx] == x){
            iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
        } else {
            iarr = allIndices(arr, x, idx + 1, fsf);
        }
        
        return iarr;
    }

}


                        
                                
                                