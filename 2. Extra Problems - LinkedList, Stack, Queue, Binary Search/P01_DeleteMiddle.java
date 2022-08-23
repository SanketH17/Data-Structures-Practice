import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class P01_DeleteMiddle {
    public static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);

        if(head == null) {
            return newNode;
        }

        Node currnNode = head;
        while(currnNode.next != null) {
            currnNode = currnNode.next;
        }

        currnNode.next = newNode;
        return head;
    }

    public static Node deleteMiddle(Node head) {
        if(head.next == null) {
            head.data = -1;
            return head;
        }

        Node slow = head;
        Node fast = head;
        Node prevNode = null;
        
        while(fast != null && fast.next != null) {
            prevNode = slow;

            slow = slow.next;

            fast = fast.next.next;
        }
        prevNode.next = slow.next;
        return head;
    }

    public static void printList(Node head) {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertAtTail(head, data);
        }
        head = deleteMiddle(head);
        printList(head);
        sc.close();
    }
}