package Stack_Problems;


class StackUsingLinkedList {

    // A linked list node
    private class Node {

        int data; // integer data
        Node next; // reference variable Node type
    }

    Node top;

    // Constructor
    StackUsingLinkedList() {
        this.top = null;
    }

    // insert at beginning
    public void push(int x) {
        Node newNode = new Node();

        newNode.data = x;
        newNode.next = top;
        top = newNode;
    }


    public void pop() {
        if(top == null) {
            System.out.println("Stack underflow");
            return;
        } else {
            top = top.next;
        }
    }

    // top element
    public int peek() {
        if(!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack underflow");
            return;
        } else {
            Node curr = top;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    

}

public class P02_StackUsingLL {
    public static void main(String[] args) {
        
    }
}
