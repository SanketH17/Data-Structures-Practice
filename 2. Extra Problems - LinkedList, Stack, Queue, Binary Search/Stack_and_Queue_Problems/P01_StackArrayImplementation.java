package Stack_and_Queue_Problems;

import java.util.Scanner;

class Stack {

    int[] arr;
    int tos; // top of the stack

    // constructor
    Stack(int maxSize) {
        arr = new int[maxSize];
        tos = -1;
    }

    /* ____________________________________________________________ */

    boolean isEmpty() {
        return tos == -1;
    }
    /* ____________________________________________________________ */

    // Number of elements in the stack
    int getSize() {
        return tos + 1;
    }

    /* ____________________________________________________________ */

    void push(int element) {
        if (tos == arr.length - 1) {
            System.out.println("Stack overflow");
        } else {
            tos++;
            arr[tos] = element;
        }
    }

    /* ____________________________________________________________ */

    // returns the value at the top of the stack
    int peek() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[tos];
        }
    }
    /*____________________________________________________________*/

    // returns the top element and it returns the value removed
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow - Can't pop the element");
            return -1;
        } else {
            int value = arr[tos];
            // return arr[tos--]; or
            tos--;
            return value;
        }

    }
    /*____________________________________________________________*/

    void display() {
        for(int i = tos; i >= 0; i--) {
            System.out.println(arr[i] +  " ");
        }
        System.out.println();
    }

}

public class P01_StackArrayImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack st = new Stack(n);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();

        st.pop();
        st.pop();
        st.display();

        st.push(60);
        st.display();

        st.peek();

        boolean res = st.isEmpty();
        System.out.println("Is stack empty : " + res);

        int size = st.getSize();
        System.out.println("size of stack = " + size);

        System.out.println("Peek element : " + st.peek());


        sc.close();
    }
}
