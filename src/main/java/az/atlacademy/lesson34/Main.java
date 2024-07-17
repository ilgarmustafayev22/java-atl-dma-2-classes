package az.atlacademy.lesson34;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        String peek = queue.peek();
        System.out.println(peek);

        String poll = queue.poll();
        System.out.println(poll);

        System.out.println(queue);

        Deque<String> deque = new LinkedList<>();
        deque.push("A");
        deque.push("B");
        deque.push("C");
        deque.push("D");

        String peek1 = deque.peek();
        System.out.println(peek1);

        String poll1 = deque.poll();
        System.out.println(poll1);

        String pop = deque.pop();
        System.out.println(pop);

        System.out.println(deque);

    }

}
