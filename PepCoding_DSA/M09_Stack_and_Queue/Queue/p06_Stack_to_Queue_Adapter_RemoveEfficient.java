package M09_Stack_and_Queue.Queue;

/* 
remove and peek must be in a constant time - O(1)
add(val) can be in linear time.
*/

import java.io.*;
import java.util.*;

public class p06_Stack_to_Queue_Adapter_RemoveEfficient {

    public static class StackToQueueAdapter {
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        public StackToQueueAdapter() {
            mainS = new Stack<>();
            helperS = new Stack<>();
        }

        int size() {
            return mainS.size();
        }

        void add(int val) {
            while (mainS.size() > 0) {
                helperS.push(mainS.pop());
            }

            mainS.push(val);

            while (helperS.size() > 0) {
                mainS.push(helperS.pop());
            }
        }

        int remove() {
            if (size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            } else {
                return mainS.pop();
            }
        }

        int peek() {
            if (size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            } else {
                return mainS.peek();
            }
        }

    }

    /************************* : The base code is already given as below we have to implement the above functions :*******************************/

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StackToQueueAdapter qu = new StackToQueueAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}



/*

Time Complexity:
Add: The time complexity is O(n) as we are popping all the values from the main stack and pushing them 
into the helper stack and doing vice-versa. So, the time complexity becomes n+n=2n=O(n).

Remove: The time complexity for this method is O(1) as we just popped a value from the main stack.

Size: The time complexity is O(1) as we just return the size of the main stack.

Peek: The time complexity is O(1) as we just use the peek method of the main stack.

Space Complexity:
Well the space complexity can be considered as O(n) as we are using two stacks for implementing the queue. 
But, these two stacks are given to us in our question, and apart from these stacks, 
we have not used any extra data structure or memory to implement the queue. Hence the space complexity will be O(1).

 */