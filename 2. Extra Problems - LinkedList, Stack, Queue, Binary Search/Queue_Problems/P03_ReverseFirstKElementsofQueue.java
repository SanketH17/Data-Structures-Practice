package Queue_Problems;

import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class P03_ReverseFirstKElementsofQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.offer(sc.nextInt()); //offer(object) 	It is used to insert the specified element into this queue.
        }

       reverseKElement(q, k);
        
        sc.close();
    }

    public static void reverseKElement(Queue<Integer> q, int k) {
        int n = q.size();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < k; i++) {
            st.push(q.remove()); //poll() 	It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
        }

        while(!st.isEmpty()) {
            q.add(st.pop()); //offer(object) 	It is used to insert the specified element into this queue.
        }

        for(int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }

}
