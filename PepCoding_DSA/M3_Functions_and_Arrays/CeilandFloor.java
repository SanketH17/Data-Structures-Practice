package PepCoding_DSA.M3_Functions_and_Arrays;

import java.util.Scanner;


/*   

jab low set hota hai tb floor set hot hai and (lower bound)
jab high set hota hai tb ceil  set hota hai (higher boung)

*/


public class CeilandFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        int lo = 0;
        int hi = arr.length;
        int ceil = 0;
        int floor = 0;
        // Eg : 10 12 15 20 25 35 40
        // data = 14


        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(data < arr[mid]){
               hi = mid - 1;
               ceil = arr[mid];
            }
            else if(data > arr[mid]){
               lo = mid + 1;
               floor = arr[mid];
            }
            else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
        sc.close();
    }
}
