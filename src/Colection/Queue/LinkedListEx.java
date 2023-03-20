package Colection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Zaur");
        queue.offer("Maria");
        queue.offer("Ion");
        queue.offer("Mihai");
        queue.offer("Elena");
        System.out.println(queue);
//        queue.remove("Mihai");
//        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.peek());
    }
}
