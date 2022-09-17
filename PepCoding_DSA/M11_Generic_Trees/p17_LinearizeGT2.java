package M11_Generic_Trees;

import java.io.*;
import java.util.*;

public class p17_LinearizeGT2 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
        return root;
    }

    public static void mirror(Node node) {

        for (Node child : node.children) { // 1
            mirror(child);
        }
        //Collections.reverse(node.children); // 2

    }

    /*------------------------------------------------------------------------------------------------------------------------------------------------*/
    public static void RemoveLeaves(Node node) {

        for (int i = node.children.size() - 1; i >= 0; i--) {
            Node child = node.children.get(i);
            if (child.children.size() == 0) {
                node.children.remove(child);
            }
        }

        for (Node child : node.children) {
            RemoveLeaves(child);
        }

    }

    /*
     * Time Complexity:
     * We are traversing all the nodes once, hence the time complexity will be O(n)
     * where n = number of nodes in the generic tree.
     * 
     * Space Complexity:
     * We are not using any extra space in the form of any auxiliary data structure.
     * Hence the space complexity is O(1).
     * 
     * Note: We are using recursion which does take stack space of O(d) where d =
     * maximum depth of the generic tree.
     */
    /*------------------------------------------------------------------------------------------------------------------------------------------------*/

    private static Node getTail(Node node) {
        while (node.children.size() == 1) {
            node = node.children.get(0);
        }
        return node;
    }

    public static void Linearize(Node node) {
        for (Node child : node.children) {
            Linearize(child);
        }

        while (node.children.size() > 1) {
            Node lc = node.children.remove(node.children.size() - 1); // last child
            Node sl = node.children.get(node.children.size() - 1); // second last child
            Node slt = getTail(sl); // second last tail
            slt.children.add(lc);
        }

    }

    /*------------------------------------------------------------------------------------------------------------------------------------------------*/


    public static Node Linearize2(Node node) {
        if(node.children.size() == 0) {
            return node;
        }

        Node lkt = Linearize2(node.children.get(node.children.size() - 1));
        while (node.children.size() > 1) {
            Node last = node.children.remove(node.children.size() - 1);
            Node sl = node.children.get(node.children.size() - 1);
            Node slkt = Linearize2(sl);
            slkt.children.add(last);
        }
        return lkt;

    }



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        Linearize(root);
        display(root);
    }
}
