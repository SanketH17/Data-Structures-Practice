package LinkedList;
import java.util.Scanner;

public class P06_AddOneInLL {

    static class Node{
        int data;
        Node next;
    }

    static Node newNode(int data) {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }

    static Node reverse(Node head) {
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

    static Node addOneUtil(Node head) {
        Node res = head;
        Node temp = null;
        //Node prev = null;

        int carry = 1, sum;
        while(head != null) {

            sum = carry + head.data;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;

            head.data = sum;
            temp = head;
            head = head.next;
        }
        if(carry > 0) {
            temp.next = newNode(carry);
        }

        return res;
    }

    static Node addOne(Node head) {
        //head = reverse(head);
        head = addOneUtil(head);
        return reverse(head);
    }


    
    static void printList(Node node) {
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static Node addLast(Node head, int data) {
        
        if(head == null) {
            return newNode(data);
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode(data);
        return head;
    }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;

        while(n > 0) {
            head = addLast(head, n%10);
            n = n / 10;
        }
        System.out.println("List is - \n");
        printList(head);

        head = addOne(head);
        System.out.println();
        System.out.println("Result is - \n");
        printList(head);
        sc.close();
    }
}
