package M11_Generic_Trees;


/* */

import java.io.*;
import java.util.*;

public class p07_GT_Traversal {
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

    public static int size(Node node) {
        int s = 0;

        for (Node child : node.children) {
            s += size(child);
        }
        s += 1;

        return s;
    }

    public static int max(Node node) {
        int max = Integer.MIN_VALUE;

        for (Node child : node.children) {
            int cm = max(child);
            max = Math.max(cm, max);
        }
        max = Math.max(node.data, max);

        return max;
    }

    public static int height(Node node) {
        int ht = -1;

        for (Node child : node.children) {
            int ch = height(child);
            ht = Math.max(ch, ht);
        }

        ht += 1;
        return ht;
    }


    public static void traversals(Node node) {
        // euler's left on the way deep in the recursion, node's pre area
        System.out.println("Node's pre " + node.data);

        for(Node child : node.children) {
            
            // edge pre
            System.out.println("Edge Pre " + node.data + " -- " + child.data);
            
            traversals(child);

            // edge post
            System.out.println("Edge Post " + node.data + " -- " + child.data);
        }

        System.out.println("Node's Post " + node.data);
        // euler's right, on thr way out of recursion, node's post area

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
        // int m = max(root);
        // System.out.println(m);
        // display(root);
        //int h = height(root);
        //System.out.println(h);
        traversals(root);
    }

}
