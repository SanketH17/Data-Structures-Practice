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

class LinekdList {
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
}

public class P05_SwapKthNodesFromEnd {

    public static Node swap_node(Node root, int n, int k) {
        if(n < k) {
            return root;
        }
        if (2 * k - 1 == n) {
            return root;
        }

        // getting kth element from left
        Node x = root;
        Node x_prev = null;
        for(int i = 1; i < k; i++) {
            x_prev = x;
            x = x.next;
        }

        // getting Kth element from right
        Node y = root;
        Node y_prev = null;
        for(int i = 1; i < n - k + 1; i++) {
            y_prev = y;
            y = y.next;
        }

        // Now we have x, x_prev
        // y, y_prev
        // x -> at Kth Node
        // x_prev -> at k-1th Node 

        // y -> (n-k+1)th Node
        // y_prev -> prev of y node

        if(x_prev != null) {
            x_prev.next = y;
        }

        if(y_prev != null) {
            y_prev.next = x;
        }

        Node temp = x.next;
        x.next = y.next;
        y.next = temp;

        if(k == 1) {
            root = y;
        } 
        if(k == n) {
            root = x;
        }
        return root;

    }

    public static void main(String[] args) {

        LinekdList list = new LinekdList();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertAtEnd(data);
        }
        Node temp = swap_node(list.head, n, k);
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        //list.printLinkedList();
        sc.close();
    }
}
