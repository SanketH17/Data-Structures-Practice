package Stack_Problems;

import java.util.*;
import java.util.Stack;

/*
Sample Input : 5
                4  2  5  1  3

Sample Output : 2 -1  1 -1 -1

*/

public class P09_ImmediateSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);

        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] > st.peek()) {
                ans[i] = st.peek();
                st.pop();
            } else {
                ans[i] = -1;
                st.pop();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}
