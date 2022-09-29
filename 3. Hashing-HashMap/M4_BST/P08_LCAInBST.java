/*
2
p, q - 3, 5
2 1 3 -1 -1 -1 5 -1 -1

p, q -> 1, 3
2 1 4 -1 -1 3 -1 -1 -1 
*/

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

    public Node findLCA(Node node, int p, int q) {
        if(node == null) {
            return null;
        }

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if(node.val > p && node.val > q) {
            return findLCA(node.left, p, q);
        }

        // If both p and q are greater than root, then LCA lies in right
        if(node.val < p && node.val < q) {
            return findLCA(node.right, p, q);
        }

        return node;
    }

}

public class P08_LCAInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Insertion in BST
            BST tree = new BST();
            for (int i = 0; i < n; i++) {
                tree.insert(arr[i]);
            }
            Node t = tree.findLCA(tree.root, p, q);
            System.out.print(t.val + " ");
            testCases--;
        }

        
        //tree.inorder();

        sc.close();
    }
}
