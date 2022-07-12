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

import java.io.*;
import java.util.*;

public class p05_QueueToStackAdapter_PopEfficient {

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
            while(mainQ.size() > 0){
                helperQ.add(mainQ.remove());
            }
            mainQ.add(val);

            while(helperQ.size() > 0){
                mainQ.add(helperQ.remove());
            }
        }


        int pop() {
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                return mainQ.remove();
            }
        }


        int top() {
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                return mainQ.peek();
            }
        }
    }

    /******************************************
     * The code is already given as below we have to implement the above functions
     **********************/

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
