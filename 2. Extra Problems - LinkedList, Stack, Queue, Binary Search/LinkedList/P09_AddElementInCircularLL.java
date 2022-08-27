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

public class P09_AddElementInCircularLL {
    //static Node head = null;

    static Node addEnd(Node last, int data) {
        Node newNode = new Node(data);

        if(last == null) {
            //head = newNode;
            last = newNode;
            newNode.next = last;
            return last;
        }

        newNode.next = last.next;
        last.next = newNode;
        last = newNode;

        return last;
    }

    public static void printCLL(Node last) {
        Node currNode;
        if(last == null) {
            System.out.println("List is empty");
            return;
        }

        // Pointing to first Node of the LinkedList
        currNode = last.next;
        do{
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        } while(currNode != last.next);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node last = null;

        for(int i = 0; i < n; i++) {
            int data = sc.nextInt();
            last = addEnd(last, data);
        }
        int k = sc.nextInt();

        last = addEnd(last, k);

        printCLL(last);

        sc.close();
    }
}
