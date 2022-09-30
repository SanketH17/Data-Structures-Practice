package M4_BST;

/* */

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

class BST {
    Node root;

    public BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        else if (key < root.val) {
            root.left = insertRec(root.left, key);
        } else if (key > root.val) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root == null) {
            return;
        }
        inorderRec(root.left);
        System.out.print(root.val + " ");
        inorderRec(root.right);
    }


}

public class P10_SearchInBST {

    public static Node searchRec(Node root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        if (root.val < val) {
            return searchRec(root.right, val);
        }
        return searchRec(root.left, val);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BST tree = new BST();
        for (int i = 0; i < n; i++) {
            tree.insert(arr[i]);
        }
        
        sc.close();
    }
}
