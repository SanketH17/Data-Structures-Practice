import java.util.*;
/* */
import java.util.Queue;


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

    public void leftView(Node root) {
        if(root == null) {
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while(que.size() != 0) {
            int size = que.size();
            System.out.print(que.remove() + " ");
            while(size > 0) {
                Node rn = que.remove();
                if(rn.left != null) que.add(rn.left);
                if(rn.right != null) que.add(rn.right);
                size--;
            }
        }
    }


}

public class P09_LeftViewBinaryTree {
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
        tree.leftView(tree.root);
        sc.close();
    }
}
