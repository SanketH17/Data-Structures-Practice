package M7_Time_and_Space_Complexity;



/*

in the sorted array we find the target sum pair as :
if the target sum is > (arr[left] + arr[right]) then we decerease the right (because if we increase the left the sum will increase more).
if the target sum is < (arr[left] + arr[right]) then we increase the left (because if we decrease the right the sum will be more decreased).
if the target sum is = arr[left] + arr[right] then print it.


Time Complexity : 
for array sorting - O(nlogn)
and finding the sum - O(n)
Total Time complexity = O(nlogn)

*/


import java.util.*;
public class p13_TargetSumPair {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++)
        arr[i] = sc.nextInt();
    

    int target = sc.nextInt();
    targetSumPair(arr, target);

    sc.close();

    }


    public static void targetSumPair(int[] arr, int target) {
        Arrays.sort(arr); // Array sorted here

        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] + arr[right] == target){
                System.out.println(arr[left] + ", " + arr[right]);
                left++;
                right--;
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
    }


}
