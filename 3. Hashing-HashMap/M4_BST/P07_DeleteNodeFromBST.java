package M4_BST;

import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int key) {
        val = key;
        left = right = null;
    }
}

public class P07_DeleteNodeFromBST {
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.val > data) {
            root.left = insert(root.left, data);
        }
        if (root.val < data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static int minValue(Node root) {
        int minv = root.val;
        while (root.left != null) {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }

    public static Node deleteNodeRec(Node root, int val) {
        if (root == null) {
            return root;
        }

        if (val < root.val) {
            root.left = deleteNodeRec(root.left, val);
        } else if (val > root.val) {
            root.right = deleteNodeRec(root.right, val);
        }

        /*
         * if the key is same as root's
         * key, then this is the node to be deleted
         */
        else {
            // node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // node with two childs
            // get the inorder successor(smallest in right sub-tree)
            root.val = minValue(root.right);

            // delete the inorder successor
            root.right = deleteNodeRec(root.right, root.val);

        }
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int data = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        deleteNodeRec(root, data);
        preOrder(root);
        sc.close();
    }
}
