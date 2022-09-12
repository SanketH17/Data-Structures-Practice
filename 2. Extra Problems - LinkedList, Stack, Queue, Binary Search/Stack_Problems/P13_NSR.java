package Stack_Problems;

import java.util.*;
import java.util.Stack;;

public class P13_NSR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = NSR(arr);
        display(ans);
        sc.close();
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] NSR(int[] arr) {
        int[] nse = new int[arr.length]; // nse -> next smallest element 
        Stack<Integer> st = new Stack<>();

        nse[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);

        for(int i = arr.length - 2; i >= 0; i--) {
            while(st.size() > 0 && arr[i] <= st.peek()) {
                st.pop();
            }

            // if stack size is zero
            if(st.size() == 0) {
                nse[i] = -1;
            } else {
                nse[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return nse;

    }


}
