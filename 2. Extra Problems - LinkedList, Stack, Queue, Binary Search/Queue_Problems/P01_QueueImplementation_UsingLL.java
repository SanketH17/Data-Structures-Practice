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

}


public class P01_QueueImplementation_UsingLL {
    
}
