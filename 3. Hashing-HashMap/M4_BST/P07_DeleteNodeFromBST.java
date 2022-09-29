
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
    /*________________________________________________________________________________________________________________*/

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
    /*________________________________________________________________________________________________________________*/

    void preOrder() {
        preOrderRec(root);
    }

    public void preOrderRec(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }

    /*________________________________________________________________________________________________________________*/
    public void deleteNode(int val) {
        root = deleteNodeRec(root, val);
    }

    public Node deleteNodeRec(Node root, int val) {
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

    public static int minValue(Node root) {
        int minv = root.val;
        while (root.left != null) {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }

}

public class P07_DeleteNodeFromBST {
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
        tree.deleteNode(k);
        tree.preOrder();

        sc.close();
    }
}
