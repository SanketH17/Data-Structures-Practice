
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

    void LevelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            // 1. Take front node from queue and print 
            Node tempNode = q.poll(); //poll() removes the present head
            System.out.print(tempNode.val + " ");

            // 2. Enqueue the left child
            if(tempNode.left != null) {
                q.add(tempNode.left);
            }

            // 3. Enqueu the right child
            if(tempNode.right != null) {
                q.add(tempNode.right);
            }
        }
    }

}

public class P06_LevelOrderTraversal {
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
        tree.LevelOrder();
        sc.close();
    }
}
