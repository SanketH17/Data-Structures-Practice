package M09_Stack_and_Queue;


/*

Sample Input
17
2
9
3
8
1
7
12
6
14
4
32
0
7
19
8
12
6
4
Sample Output
9
9
8
12
12
14
14
32
32
32
32
19
19
19


 */

import java.util.*;

public class p07_SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // window size
        sc.close();
        System.out.println();
        // code 

        // Next greater element
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for(int i = arr.length - 2; i >= 0; i--){
            // -a+ -> pop, ans, push
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                nge[i] = arr.length;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);

        }

        int j = 0;
        for(int i = 0; i <= arr.length - k; i++){
            // enter the loop to find the maximum of window starting at i
            if(j < i){
                j = i;
            }
            while(nge[j] < i + k){
                j = nge[j];
            }
            
            System.out.println(arr[j]);

        }
    }
}
