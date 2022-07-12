package M09_Stack_and_Queue.Queue;
/* p02_NormalQueue */

import java.io.*;
/*

Sample Input
5
add 10
display
add 20
display
add 30
display
add 40
display
add 50
display
add 60
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
quit
Sample Output
10 
10 20 
10 20 30 
10 20 30 40 
10 20 30 40 50 
Queue overflow
10 20 30 40 50 
10
10
20 30 40 50 
20
20
30 40 50 
30
30
40 50 
40
40
50 
50
50

Queue underflow
Queue underflow

 */
public class p02_NormalQueue {

    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size() {

            return size;
        }

        void display() {

            for (int i = front; i < size; i++) {

                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void add(int val) {

            if (size == data.length) { // if queue is already full
                System.out.println("Queue overflow");
            } else {
                int rear = (front + size) % data.length;
                data[rear] = val;
                size++; // as a new values is added
            }
        }

        int remove() {

            if (size == 0) { // if queue is already empty
                System.out.println("Queue underflow");
                return -1;
            } else {
                int val = data[front];
                front = (front + 1) % data.length; // queue will be from front to size
                size--; // as a value is removed

                return val;
            }
        }

        int peek() {

            if (size == 0) { // if queue is empty
                System.out.println("Queue underflow");
                return -1;
            } else {
                int val = data[front];
                return val;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomQueue qu = new CustomQueue(n);

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
            } else if (str.startsWith("display")) {
                qu.display();
            }
            str = br.readLine();
        }
    }
}
