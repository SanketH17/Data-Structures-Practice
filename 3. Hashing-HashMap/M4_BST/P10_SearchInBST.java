package M4_BST;


import java.util.*;

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

public class P10_SearchInBST {
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) {
            root.left = insert(root.left, data);
        }
        if (root.data < data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static String search(Node root, int data) {
        if (root == null)
            return "NO";

        if (root.data == data) {
            return "YES";
        }
        if (root.data > data) {
            return search(root.left, data);
        }
        if (root.data < data) {
            return search(root.right, data);
        }
        return "NO";
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        System.out.print(search(root, data));

        sc.close();
    }
}