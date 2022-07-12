package M09_Stack_and_Queue.Queue;


import java.io.*;
import java.util.*;

public class p07_Stack_to_Queue_Adapter_AddEfficient {

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
            mainS.push(val);
        }

        int remove() {
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                while(mainS.size() > 1){
                    helperS.push(mainS.pop());
                }
                int val = mainS.pop();
                

                while(helperS.size() > 0){
                    mainS.push(helperS.pop());
                }
                return val;
            }
        }

        int peek() {
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                while(mainS.size() > 1){
                    helperS.push(mainS.pop());
                }
                int val = mainS.pop();
                helperS.push(val);

                while(helperS.size() > 0){
                    mainS.push(helperS.pop());
                }
                return val;
            }
        }
    }


/******************************************** The base code is already given as below we have to implement the above functions *************************************************/

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
Add: The time complexity is O(1) because we have used the stack push method.

Size: The time complexity is O(1) as we have just returned the size of the stack.

Peek: The time complexity of the peek method is O(n) as we pooped the entire stack of n elements and then pushed them back again. So, there are two traversals. So, the time complexity will be n+n=2n i.e. O(n).

Remove: The time complexity of this method is O(n) as we pooped the entire stack of n elements and then pushed them back again. So, there are two traversals. So, the time complexity will be n+n=2n i.e. O(n).


Space Complexity:
Well the space complexity can be considered as O(n) as we are using two stacks for implementing the queue. 
But, these two stacks are given to us in our question, and apart from these stacks, 
we have not used any extra data structure or memory to implement the queue. Hence, the space complexity will be O(1).
 */