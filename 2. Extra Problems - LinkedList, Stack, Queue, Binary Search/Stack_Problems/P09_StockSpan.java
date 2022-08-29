package Stack_Problems;

import java.util.*;
import java.util.Stack;

public class P09_StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] span = solve(arr);
        System.out.println(Arrays.toString(span));

        sc.close();
    }

    public static int[] solve(int[] arr) {
        int[] span = new int[arr.length];

        Stack <Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for(int i = 1; i < arr.length; i++) {
            // pop the elements till we get any bigger element than arr[i]
            // or no any element bigger than arr[i] - then stack will be empty
            while(st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if(st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }

        return span;
    }

}
