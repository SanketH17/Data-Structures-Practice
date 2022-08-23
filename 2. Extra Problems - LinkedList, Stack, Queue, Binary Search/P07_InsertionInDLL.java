import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class P07_InsertionInDLL {

    public static Node insertAtHead(Node head, int data) {
        // 1. Create a newNode
        Node newNode = new Node(data);

        // edge case
        if (head == null) {
            // the linked list is empty
            return newNode;
        }

        // 2. 
        head.prev = newNode;

        // 3. newNode will point to next i.e. head which was prev
        newNode.next = head;

        // 4. return the newely created node and it is the head now
        return newNode;
    }



    public static Node appendAtEnd(Node head, int data) {
        /*
         1. Allocate node
         2. put in the data
         */
        Node newNode = new Node(data);

        Node last = head;
        
        // 4. if the LL is empty, then make the new node as head
        if(head == null) {
            head = newNode;
            return head;
        }

        // 5. Else traverse till the last node 
        while(last.next != null) {
            last = last.next;
        }
        // 6. change the next of last node
        last.next = newNode;
        newNode.prev = last;
        return head;
    }



    static void printLL(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = appendAtEnd(head, data);
        }
        
        head = insertAtHead(head, k);
        printLL(head);

        sc.close();
    }
}
