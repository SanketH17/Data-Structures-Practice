package M4_BST;

import java.util.*;

/* code is running perfectly on gdb */

class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class P11_ValidateBST {
    public static Scanner sc = new Scanner(System.in);

    public static node buildTree() {
        Queue<node> q = new LinkedList<>();
        int data = sc.nextInt();
        node root = null;
        if (data != -1) {
            root = new node(data);
            q.offer(root);
        }
        while (!q.isEmpty()) {
            node temp = q.poll();
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left != -1) {
                temp.left = new node(left);
                q.offer(temp.left);
            }

            if (right != -1) {
                temp.right = new node(right);
                q.offer(temp.right);
            }
        }
        return root;
    }

    static node temp = null;

    public static boolean validate(node root, int min, int max) {
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
            node root = null;
            root = buildTree();
            boolean ans = false;
            ans = validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
            System.out.print(ans + " ");
            System.out.println();
        }
    }
}