package M4_BST;

import java.util.HashMap;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

public class P13_SumOfLeafNodes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Node> m = new HashMap<Integer, Node>();
        int n = sc.nextInt();
        Node root = null;
        while (n-- > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            char lr = sc.next().charAt(0);
            Node parent = m.get(n1);
            if (parent == null) {
                parent = new Node(n1);
                m.put(n1, parent);
                if (root == null)
                    root = parent;
            }
            Node child = new Node(n2);
            if (lr == 'L')
                parent.left = child;
            else
                parent.right = child;
            m.put(n2, child);
        }

        Accio A = new Accio();
        System.out.println(A.SumofLeafNodes(root));
        sc.close();
    }

}

class Accio {
    public int SumofLeafNodes(Node root) {
        // your code here
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return root.data;
        }
        return (SumofLeafNodes(root.left) + SumofLeafNodes(root.right));
    }
}
