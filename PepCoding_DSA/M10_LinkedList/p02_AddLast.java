package M10_LinkedList;
/* */

import java.io.*;
//import java.util.*;

public class p02_AddLast {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node(); // make a new node
            temp.data = val;
            temp.next = null;
            
            if (size == 0) {

                head = tail = temp;

            } else {

                tail.next = temp;
                tail = temp;

            }
            size++;
        }
    }

    /**************************************************************************************/

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
        System.out.println("List size : " + list.size);

        if (list.size > 0) {
            System.out.println("Tail -> data : " + list.tail.data);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }
            str = br.readLine();
        }

        testList(list);
    }
}
