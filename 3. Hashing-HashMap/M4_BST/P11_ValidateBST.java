package M4_BST;

import java.util.*;

/* code is running perfectly on gdb */

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class P11_ValidateBST {
    public static Scanner sc = new Scanner(System.in);

    public static Node buildTree() {
        Queue<Node> q = new LinkedList<>();
        int data = sc.nextInt();
        Node root = null;
        
        // Insert root element in the queue
        if (data != -1) {
            root = new Node(data);
            q.offer(root); // It is used to insert the specified element into the queue.
        }

        // Iterate till queue is not empty
        while (!q.isEmpty()) {
            Node temp = q.poll(); // It is used to retrieves and removes the head of this queue, or returns null
                                  // if this queue is empty.
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left != -1) {
                temp.left = new Node(left);
                q.offer(temp.left);
            }

            if (right != -1) {
                temp.right = new Node(right);
                q.offer(temp.right);
            }
        }
        return root;
    }

    static Node temp = null;

    public static boolean validate(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return (validate(root.left, min, root.data - 1)
                &&
                validate(root.right, root.data + 1, max));
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Node root = null;
            root = buildTree();
            boolean ans = false;
            ans = validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
            System.out.print(ans + " ");
            System.out.println();
        }
    }
}