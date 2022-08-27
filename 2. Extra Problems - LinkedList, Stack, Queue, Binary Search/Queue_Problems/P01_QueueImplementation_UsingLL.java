package Queue_Problems;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node head;
    Node tail;
    int currSize = 0;

    Queue() {
        head = null;
        tail = null;
        currSize = 0;
    }

    void insert(int value) {
        Node newNode = new Node(value);
        currSize++;
        // Insert at tail
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    int remove() {
        if(currSize == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = head.data;
        head = head.next;
        currSize--;
        return value;
    }

    int peek() {
        if(currSize == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    int size() {
        return currSize;
    }

    boolean isEmpty() {
        return currSize == 0;
    }

    void display() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

}


public class P01_QueueImplementation_UsingLL {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.insert(1);
        q.insert(2);
        q.insert(3); 
        q.insert(4);
        q.insert(5);
        q.display();   

        q.remove();
        q.remove();
        q.display();
    }
}
