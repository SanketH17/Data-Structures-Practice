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

public class P04_MinimumElementInBST {
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

    public static int MinValueInBST(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        int ans = MinValueInBST(root);
        System.out.println(ans);
        sc.close();
    }
}
