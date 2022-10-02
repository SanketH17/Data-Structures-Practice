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

public class P09_LeftViewBinaryTree {
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

    public static ArrayList<Integer> leftView(Node root) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        ArrayList<Integer> ans = leftView(root);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }
            
        sc.close();
    }
}
