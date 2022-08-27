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
/*************************************************************************************************************/
public class P04_CompareTwoLL {

    public static Node insertAtEnd(Node head, int data) {
        
        Node newNode = new Node(data);

        if(head == null) {
            return newNode;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return head;

    }
/*************************************************************************************************************/

    public static int compareTwoLL(Node head1, Node head2) {

        if(head1 == null && head2 == null) {
            return 1;
        } 
        Node first_runner = head1;
        Node second_runner = head2;

        while(first_runner != null && second_runner != null) {
            if(first_runner.data != second_runner.data) {
                return 0;
            }
            
            // we will reach at the end if Two LLs are same and will return 1
            // Eg : 1 -> 2 -> 3 -> null
            //      1 -> 2 -> 3 -> null
            if(first_runner.next == null && second_runner.next == null) {
                return 1;
            }
            first_runner = first_runner.next;
            second_runner = second_runner.next;
        }

        return 0;
    }

/*************************************************************************************************************/

    public static void printList(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

/*************************************************************************************************************/



    public static void main(String[] args) {
        Node head1 = null;
        Node head2 = null;
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Linked list 1
        for(int i = 0; i < m; i++) {
            int data = sc.nextInt();
            head1 = insertAtEnd(head1, data);
        }
        // Linked List 2
        for(int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head2 = insertAtEnd(head2, data);
        }

        int ans = compareTwoLL(head1, head2);
        System.out.println(ans);
        sc.close();
    }
}
