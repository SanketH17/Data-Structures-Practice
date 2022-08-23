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

    void addNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;

    }
}



public class P11_MergeTwoLLs {

    public static Node merge(Node h1, Node h2) {

        Node dummy = new Node(-1);
        Node tail = dummy;

        while(true) {

            if(h1 == null) {
                tail.next = h2;
                break;
            }

            if(h2 == null) {
                tail.next = h1;
                break;
            }

            if(h1.data <= h2.data) {
                tail.next = h1;
                h1 = h1.next;
            } else {
                tail.next = h2;
                h2 = h2.next;
            }

            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        Linkedlist list1 = new Linkedlist();
        Linkedlist list2 = new Linkedlist();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list1.addNode(a);

        }

        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int b = sc.nextInt();
            list2.addNode(b);
        }

        Node h = merge(list1.head, list2.head);

        while(h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        sc.close();

    }
}
