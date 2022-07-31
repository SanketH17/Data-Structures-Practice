package M10_LinkedList;

import java.io.*;

public class p27_IntersectionOfLL {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head; // initially head = null
        Node tail; // initially tail = null
        int size; // initially size = 0

/*-----------------------------------------------------------------------------*/
        void addLast(int val) {
            Node temp = new Node();
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

/*------------------------------------------------------------------------------------------------*/
        public int size() {
            return size;
        }

/*------------------------------------------------------------------------------------------------*/
        public void display() {
            Node temp = head; // Just declaring another node (not creating new node) temp which is pointing to head
                             
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

/*------------------------------------------------------------------------------------------------*/
        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

/*-------------------------------------------------------------------------------------------------*/
        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

/*---------------------------------------------------------------------------------------------------*/
        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

/*--------------------------------------------------------------------------------------------------*/
        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

/*---------------------------------------------------------------------------------------------------*/
        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

/*----------------------------------------------------------------------------------------------------*/
        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node(); // new node memory allocation
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;

                temp.next = node;
                size++;
            }
        }

/*----------------------------------------------------------------------------------------------------*/
        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }

                tail = temp;
                tail.next = null;
                size--;
            }
        }

/*--------------------------------------------------------------------------------------------------*/
        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        }

/*-------------------------------------------------------------------------------------------------*/
        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

/*-----------------------------------------------------------------------------*/
        public void reverseDI() {
            int li = 0;
            int ri = size - 1;
            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

/*-----------------------------------------------------------------------------*/
        public void reversePI() {
            if (size <= 1) {
                return;
            }

            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }

/*-----------------------------------------------------------------------------*/
        public int kthFromLast(int k) {
            Node s = head;
            Node f = head;

            for (int i = 0; i < k; i++) {
                f = f.next;
            }

            while (f != null) {
                s = s.next;
                f = f.next;
            }
            return s.data;
        }

/*-----------------------------------------------------------------------------------------------*/
        public int mid() {
            Node s = head;
            Node f = head;

            while(f.next != null && f.next.next != null){
                s = s.next;
                f = f.next.next;
            }
            return s.data;
        }
/*------------------------------------------------------------------------------------------------*/
        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;

            LinkedList res = new LinkedList();

            while(one != null && two != null){
                if(one.data < two.data){
                    res.addLast(one.data);
                    one = one.next;
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }

            while(one != null){
                res.addLast(one.data);
                one = one.next;
            }
            while(two != null){
                res.addLast(two.data);
                two = two.next;
            }
            return res;
        }
/*------------------------------------------------------------------------------------------------*/
        public static Node midNode(Node head, Node tail){
            Node f = head;
            Node s = head;

            while(f != tail && f.next != tail){
                f = f.next.next;
                s = s.next;
            }
            return s;
        }
        public static LinkedList mergeSort(Node head, Node tail){

            if(head == tail){
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;
            }
            Node mid = midNode(head, tail);
            LinkedList fsh = mergeSort(head, mid); // first sorted half
            LinkedList ssh = mergeSort(mid.next, tail); // second sorted half

            LinkedList cl = LinkedList.mergeTwoSortedLists(fsh, ssh);
            return cl;

        }
/*------------------------------------------------------------------------------------------------*/
        public void removeDuplicates(){
            LinkedList res = new LinkedList();

            while(this.size() > 0){
                int val = this.getFirst();
                this.removeFirst();

                if(res.size() == 0 || res.tail.data != val){
                    res.addLast(val);
                }
            }
            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }
/*---------------------------------------------------------------------------------------------------------*/
        public void oddEven(){
            LinkedList odd = new LinkedList(); 
            LinkedList even = new LinkedList();

            while(this.size > 0){
                int val = this.getFirst();
                this.removeFirst();

                if(val % 2 == 0){
                    even.addLast(val);
                } else {
                    odd.addLast(val);
                }
            }
            // checking if odd and even are of size greater than 0
            if(odd.size > 0 && even.size > 0){
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            } 
            // checking the elements are present only in odd list
            else if (odd.size > 0){
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            }
            // checking the elements are present only in even list 
            else if(even.size > 0) {
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
        }
/*--------------------------------------------------------------------------------------------------------*/
        // we will do three things in this function
        // 1. prev ka tail ka next = curr ka head
        // 2. prev ki tail = curr ki tail
        // 3. prev ki size++ jitna curr ka size tha utne se
        // and curr ko new kae denge
        public void kReverse(int k) {
            LinkedList prev = null;

            while(this.size > 0){
                LinkedList curr = new LinkedList();

                if(this.size >= k){
                    for(int i = 0; i < k; i++){
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addFirst(val);
                    }
                }
                else {
                    int os = this.size;
                    for(int i = 0; i < os; i++){
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);
                    }
                }
                
                if(prev == null){
                    prev = curr;
                } else {
                    prev.tail.next = curr.head;
                    prev.tail = curr.tail;
                    prev.size += curr.size;
                }

            }
            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
        }
/*-------------------------------------------------------------------------------------------------------*/
        private void displayReverseHelper(Node node){
            if(node == null){
                return;
            }
            displayReverseHelper(node.next);
            System.out.println(node.data + " ");
        }

        public void displayReverse(){
            displayReverseHelper(head);
            System.out.println();
        }
/*-------------------------------------------------------------------------------------------------------*/
        private void reversePRHelper(Node node){
            if(node == null){
                return;
            }
            else{
                node.next.next = node;
            }
        }

        public void reversePR(){
            reversePRHelper(head);
            head.next = null;
            Node temp = head;
            head = tail;
            tail = temp;
        }
/*-------------------------------------------------------------------------------------------------------*/
        public void reverseDRHelper(Node right, int floor) {
            if(right == null){
                return;
            }
            reverseDRHelper(right.next, floor + 1);

            if(floor <= size / 2){
                int temp = right.data;
                right.data = rleft.data;
                rleft.data = temp;

                rleft = rleft.next;
            }

        }

        Node rleft;
        public void reverseDR(){
            rleft = head;
            reverseDRHelper(head, 0);
        }
/*-------------------------------------------------------------------------------------------------------------*/
        private boolean IsPalindromeHelper(Node right){
            if(right == null){
                return true;
            }
            boolean rres = IsPalindromeHelper(right.next);
            if(rres == false){
                return false;
            }
            else if(pleft.data != right.data){
                return false;
            }
            else {
                pleft = pleft.next;
                return true;
            }
            
        }

        Node pleft;
        public boolean IsPalindrome() {
           pleft = head;
           return IsPalindromeHelper(head); 
        }
/*-------------------------------------------------------------------------------------------------------------*/
        
        private void foldHelper(Node right, int floor){
            if(right == null){
                return;
            }
            foldHelper(right.next, floor + 1);

            if(floor > size / 2){
                Node temp = fleft.next;
                fleft.next = right;
                right.next = temp;
                fleft = temp;
            } else if(floor == size / 2) {
                tail = right;
                tail.next = null;
            }
        }

        Node fleft;
        public void fold() {
            fleft = head;
            foldHelper(head, 0);
        }
/*-------------------------------------------------------------------------------------------------------------*/

        public static int addListHelper(Node one, int pv1, Node two, int pv2, LinkedList res){
            if(one == null && two == null){
                return 0;
            }
            int data = 0;
            if(pv1 > pv2){
                int oc = addListHelper(one.next, pv1 - 1, two, pv2, res);
                data = one.data + oc;
            } else if (pv1 < pv2){
                int oc = addListHelper(one, pv1, two.next, pv2 - 1, res);
                data = two.data + oc;
            } else {
                int oc = addListHelper(one.next, pv1 - 1, two.next, pv2 - 1, res);
                data = one.data + two.data + oc;
            }

            int nd = data % 10;
            int nc = data / 10;
            
            res.addFirst(nd);
            return nc;
        }

        public static LinkedList addTwoLists(LinkedList one, LinkedList two) {
            LinkedList res = new LinkedList();

            int oc = addListHelper(one.head, one.size, two.head, two.size, res);
            if(oc > 0){
                res.addLast(oc);
            }
            return res;
        }
/*-------------------------------------------------------------------------------------------------------------*/
        public static int findIntersection(LinkedList one, LinkedList two){
            Node t1 = one.head;
            Node t2 = two.head;

            int delta = Math.abs(one.size - two.size);

            if(one.size > two.size){
                for(int i = 0; i < delta; i++){
                    t1 = t1.next;
                }
            } else {
                for(int i = 0; i < delta; i++){
                    t2 = t2.next;
                }
            }
            while(t1 != t2){
                t1 = t1.next;
                t2 = t2.next;
            }

            return t1.data;
        }
/*-------------------------------------------------------------------------------------------------------------*/
    }// end of linked list class








    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        int n2 = Integer.parseInt(br.readLine());
        LinkedList l2 = new LinkedList();
        String[] values2 = br.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            int d = Integer.parseInt(values2[i]);
            l2.addLast(d);
        }

        int li = Integer.parseInt(br.readLine());
        int di = Integer.parseInt(br.readLine());
        if (li == 1) {
            Node n = l1.getNodeAt(di);
            l2.tail.next = n;
            l2.tail = l1.tail;
            l2.size += l1.size - di;
        } else {
            Node n = l2.getNodeAt(di);
            l1.tail.next = n;
            l1.tail = l2.tail;
            l1.size += l2.size - di;
        }

        int inter = LinkedList.findIntersection(l1, l2);
        System.out.println(inter);
    }
}