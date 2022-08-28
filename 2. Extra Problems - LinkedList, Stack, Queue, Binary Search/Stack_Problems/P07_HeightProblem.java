package Stack_Problems;

import java.util.*;
import java.util.Stack;


public class P07_HeightProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        ans[0] = -1;
        st.push(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            while(st.size() > 0 && arr[i] <= st.peek()) {
                st.pop();
            }

            if(st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        //System.out.println(Arrays.toString(ans));
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
