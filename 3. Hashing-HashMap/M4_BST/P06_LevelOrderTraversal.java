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

public class P06_LevelOrderTraversal {
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

    public static void LevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            // 1. Take front node from queue and print
            Node tempNode = q.poll(); // poll() removes the present head
            System.out.print(tempNode.val + " ");

            // 2. Enqueue the left child
            if (tempNode.left != null) {
                q.add(tempNode.left);
            }

            // 3. Enqueu the right child
            if (tempNode.right != null) {
                q.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        LevelOrder(root);
        sc.close();
    }
}
