package LinkedList;
import java.util.*;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class P10_ReverseAltNodeInLL {
    static Node head;
    
    public static Node reverse(Node head) {
         Node prev = null;
         Node curr = head;
         Node next = null;

         while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }
         return prev;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        head = new Node(sc.nextInt());

        Node curr = head;

        for(int i = 1; i < n; i++) {
            int x = sc.nextInt();
            curr.next = new Node(x);
            curr = curr.next;
        }

        Node odd = head;
        Node oddIndex = odd;

        Node even = head.next;
        Node evenIndex = even;

        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = null;

        Node temp = reverse(evenIndex);

        odd.next = temp;
        
        while(oddIndex != null) {
            System.out.print(oddIndex.data + " ");
            oddIndex = oddIndex.next;
        }
        sc.close();
    }
}
