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
/*___________________________________________________________________________________________________________________*/

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
/*___________________________________________________________________________________________________________________*/
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
/*___________________________________________________________________________________________________________________*/
    void preOrder() {
        preOrderRec(root);
    }

    public void preOrderRec(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }
/*___________________________________________________________________________________________________________________*/
    void postOrder() {
        postOrderRec(root);
    }

    public void postOrderRec(Node root) {
        if(root == null) {
            return;
        }
        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.print(root.val + " ");
    }
/*___________________________________________________________________________________________________________________*/


}



public class P03_PostOrderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BST tree = new BST();
        for (int i = 0; i < n; i++) {
            tree.insert(arr[i]);
        }
        tree.postOrder();
        sc.close();
    }
}

