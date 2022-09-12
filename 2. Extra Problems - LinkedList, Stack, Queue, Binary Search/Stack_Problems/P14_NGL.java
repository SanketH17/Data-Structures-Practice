package Stack_Problems;

import java.util.*;
import java.util.Stack;;

public class P14_NGL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = NGL(arr);
        display(ans);
        sc.close();
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] NGL(int[] arr) {
        int[] ngl = new int[arr.length]; // ngl -> next greater element to the left

        Stack<Integer> st = new Stack<>();

        ngl[0] = -1;
        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            //
            if (st.size() == 0) {
                ngl[i] = -1;
            } else {
                ngl[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ngl;
    }

}
