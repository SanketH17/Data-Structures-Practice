package M4_BST;

import java.util.*;

/* print ans in postOrder Traversal */

class Node {
    int val;
    Node left;
    Node right;

    Node(int data) {
        this.val = data;
    }
}

public class P12_BinaryTreeFromPreAndInOrder {
    public static Scanner sc = new Scanner(System.in);

    public static Node buildTree(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {

        if(preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }

        Node root = new Node(preorder[preStart]);

        int inIndex = 0;
        for(int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == root.val) {
                inIndex = i;
            }
        }
        root.left = buildTree(preStart + 1, inStart, inIndex-1, preorder, inorder);
        root.right = buildTree(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);

        return root;
    }

    public static void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] preOrder = new int[n];
        int[] inOrder = new int[n];
        for(int i = 0; i < n; i++) {
            preOrder[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            inOrder[i] = sc.nextInt();
        }

        Node root = buildTree(0, 0, inOrder.length - 1, preOrder, inOrder);
        postOrderTraversal(root);
    }
}
