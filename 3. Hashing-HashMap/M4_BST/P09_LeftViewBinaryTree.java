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

    public ArrayList<Integer> leftView(Node root) {
        LinkedList<Node> que = new LinkedList<>();
        que.addLast(root);
        ArrayList<Integer> ans = new ArrayList<>();

        while (que.size() != 0) {
            int size = que.size();
            ans.add(que.getFirst().val);
            while (size-- > 0) {
                Node rn = que.removeFirst(); // rn : remove Node

                if (rn.left != null)
                    que.addLast(rn.left);
                if (rn.right != null)
                    que.addLast(rn.right);
            }
        }
        return ans;
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
        ArrayList<Integer> ans = tree.leftView(tree.root);
        for (Integer i : ans)
            System.out.print(i + " ");
        sc.close();
    }
}
