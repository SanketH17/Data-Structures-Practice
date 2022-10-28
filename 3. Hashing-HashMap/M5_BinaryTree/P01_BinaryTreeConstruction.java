package M5_BinaryTree;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
        left = right = null;
    }

}

public class P01_BinaryTreeConstruction {

    // arr : 1, 2, 3, 4, 5, 6, 6, 6, 6
    public static Node insertLevelOrder(int[] arr, int i) {
        Node root = null;

        // Base case for recursion
        if (i < arr.length) {
            root = new Node(arr[i]);

            // Insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);

            // Insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }

        return root;
    }
    /* */
    public static void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = insertLevelOrder(arr, 0);
        inOrder(root);

        sc.close();
    }
}
