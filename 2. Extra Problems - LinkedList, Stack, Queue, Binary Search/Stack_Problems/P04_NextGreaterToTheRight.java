package Stack_Problems;

import java.util.*;
import java.util.Stack;

public class P04_NextGreaterToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = solve(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }

    public static int[] solve(int[] arr) {
        int[] nge = new int[arr.length]; // next greater element

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;

        for(int i = arr.length - 2; i >= 0; i--) {
            // - a + -> pop ans push
            while(st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            // if stack size is zero
            if(st.size() == 0) {
                nge[i] = -1;
            } else { // if we get a greater element at top than arr[i]
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return nge;

    }
}
