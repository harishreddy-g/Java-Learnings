package Queue;

import java.util.*;

class deQueue {
    Deque<Integer> dq = new ArrayDeque<>();

    void addFront(int x) {
        dq.addFirst(x);// or dq.offerFirst(x);

    }

    void addLast(int x) {
        dq.addLast(x);// or dq.offerLast(x);
    }

    void removeFirst() {
        if (!dq.isEmpty()) {
            dq.pollFirst(); // or dq.removeFirst();
        } else {
            System.out.println("Deque is empty");
        }
    }
    void removeLast(){
        if (!dq.isEmpty()) {
            dq.pollLast(); // or dq.removeLast();
        } else {
            System.out.println("Deque is empty");
        }
    }
    void getFirst() {
        if (!dq.isEmpty()) {
            System.out.println(dq.peekFirst()); // or dq.getFirst();
        } else {
            System.out.println("Deque is empty");
        }
    }
    void getLast() {
        if (!dq.isEmpty()) {
            System.out.println(dq.peekLast()); // or dq.getLast();
        } else {
            System.out.println("Deque is empty");
        }
    }
    void getSize() {
        System.out.println(dq.size());
    }
    void display() {
        System.out.println(dq);
    }

}

public class dqueue {
    public static void main(String[] args) {
        deQueue dq = new deQueue();
        dq.addFront(5);
        dq.addLast(3);
        dq.addFront(8);
        dq.display(); // [8, 5, 3]
        dq.getFirst(); // 8
        dq.getLast(); // 3
        dq.removeFirst();
        dq.display(); // [5, 3]
        dq.removeLast();
        dq.display(); // [5]
        dq.getSize(); // 1}
    }
}
