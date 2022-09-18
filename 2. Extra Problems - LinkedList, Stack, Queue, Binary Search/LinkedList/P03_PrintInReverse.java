package LinkedList;
import java.util.Scanner;

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

        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void printList() {
        if(head == null) {
            System.out.println("-1");
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
}


public class P03_PrintInReverse {

    public static void reverseLL(Node currNode) {
        if(currNode.next != null) {
            reverseLL(currNode.next);
        }
        System.out.print(currNode.data + " ");
    }

    public static Node reverseLL_Iteative(Node root) {

        Node prev = null;
        Node curr = root;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        root = prev;
        return root;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Linkedlist list = new Linkedlist();
        
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }
        //reverseLL(list.head);
        //list.printList();
        Node head = reverseLL_Iteative(list.head);
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        sc.close();
    }
}





