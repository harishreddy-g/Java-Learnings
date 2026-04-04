package Queue;

import java.util.*;

class priorityQ {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    void add(int x) {
        pq.add(x);
    }

    void remove() {
        if (!pq.isEmpty()) {
            pq.poll();
        } else {
            System.out.println("Priority Queue is empty");
        }
    }

    void getTop() {
        if (!pq.isEmpty()) {
            System.out.println(pq.peek());
        } else {
            System.out.println("Priority Queue is empty");
        }
    }

    void getSize() {
        System.out.println(pq.size());
    }

    void display() {
        System.out.println(pq);
    }
}

public class priorityqueue {
    public static void main(String[] args) {
        priorityQ pq = new priorityQ();
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.display(); // [3, 5, 8]
        pq.getTop(); // 3
        pq.remove();
        pq.display(); // [5, 8]
        pq.getSize(); // 2
    }
}
