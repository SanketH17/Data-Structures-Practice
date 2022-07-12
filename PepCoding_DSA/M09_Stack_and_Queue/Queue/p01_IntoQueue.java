package M09_Stack_and_Queue.Queue;

import java.util.*;

public class p01_IntoQueue {
    public static void main(String[] args) {
        Queue <Integer> que = new ArrayDeque<>();

        que.add(10);
        que.add(20);
        System.out.println(que);
        que.add(30);
        que.add(40);
        System.out.println(que);

        System.out.println("Removed element - " + que.remove());
        System.out.println(que);

        System.out.println("Peek element - " + que.peek());
    }
}
