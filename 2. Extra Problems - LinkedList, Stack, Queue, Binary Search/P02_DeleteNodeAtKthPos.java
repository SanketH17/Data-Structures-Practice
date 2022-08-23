import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    Node head;
    Node tail;

    void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void DeleteKthElement(int k) {
        if (k == 0) {
            head = head.next;
        } else {
            // we will find (k-1)th node
            Node temp = head;
            while (k > 1) {
                temp = temp.next;
                k--;
            }
            temp.next = temp.next.next;
        }
    }

    void printLinkedList() {
        if (head == null) {
            System.out.println("-1");
        } else {
            Node temp = head;
            while (temp != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    
}

public class P02_DeleteNodeAtKthPos {

    public static void main(String[] args) throws java.lang.Exception {
        Linkedlist list = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.insertAtEnd(x);
        }
        int k = sc.nextInt();

        list.DeleteKthElement(k);
        list.printLinkedList();
        
        sc.close();
    
    }
}









