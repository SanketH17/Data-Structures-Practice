package M09_Stack_and_Queue.Queue;

/*
Sample Input :
push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
quit



Sample Output :
11
7
11
4
6
4
2
5
2
8
4
8
5
3
5
20
2
20
10
1
10
*/


import java.util.*;

import java.io.*;


public class p04_QueueToStackAdapter_PushEfficient {

    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();
        }

        void push(int val) {
            mainQ.add(val);
        }

        int pop() {
            int val = -1;
            if(size() == 0){
                System.out.println("Stack underflow");
            }
            
            else{
                while(mainQ.size() > 1){
                    helperQ.add(mainQ.remove());
                }

                val = mainQ.remove();
                

                while(helperQ.size() > 0){
                    mainQ.add(helperQ.remove());
                }
            }
            return val;
        }

        int top() {
            int val = -1;;
            if(size() == 0){
                System.out.println("Stack underflow");
            }
            
            else{
                while(mainQ.size() > 1){
                    helperQ.add(mainQ.remove());
                }

                val = mainQ.remove();
                helperQ.add(val);

                while(helperQ.size() > 0){
                    mainQ.add(helperQ.remove());
                }
            }
            return val;
            
            
        }
    }

/******************************************** ------------- : Given code as below :------------*******************************************************/
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueToStackAdapter st = new QueueToStackAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }
}

/*

Time & Space Complexity Analysis
Push - O(1): We are just adding the element in the main queue.

Size - O(1): We are returning the size of the main queue.

Pop (or Top) - O(n) :Firstly, we are dequeuing size elements from the main queue adding them in the helper queue, which takes n * O(1) = O(n) time.
Now, we are doing the reverse process (removing n elements from the helper queue and adding them to the main queue), which again takes O(n) time.
Hence, total time taken will be O(n + n) = O(n).

 */