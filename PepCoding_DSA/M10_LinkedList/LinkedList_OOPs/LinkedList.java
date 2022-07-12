package M10_LinkedList.LinkedList_OOPs;

/*

this --> by using this hum class ke data members ko access karte hain


 */
public class LinkedList {
    
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    //private Node tail;
    //private int size;
    
    public void display() {

        Node temp = this.head ;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
