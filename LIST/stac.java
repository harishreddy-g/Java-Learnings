package LIST;

import java.util.*;

class stackInbuilt {
    Stack<Integer> stack = new Stack<>();

    void add(int x) {
        stack.push(x);
    }

    void remove() {
        if (!stack.isEmpty()) {
            stack.pop();
        } else {
            System.out.println("Stack is empty");
        }
    }

    void getTop() {
        if (!stack.isEmpty()) {
            System.out.println(stack.peek());
        } else {
            System.out.println("Stack is empty");
        }
    }

    void getSize() {
        System.out.println(stack.size());
    }

    void position(int x) {
        int pos = stack.search(x);
        if (pos != -1) {
            System.out.println("Element found at position: " + pos);
        } else {
            System.out.println("Element not found in stack");
        }
    }

    void display() {
        System.out.println(stack);
    }
}

public class stac {
    public static void main(String[] args) {
        stackInbuilt s = new stackInbuilt();
        s.add(5);
        s.add(3);
        s.add(8);
        s.display(); // [5, 3, 8]
        s.getTop(); // 8
        s.remove();
        s.display(); // [5, 3]
        s.getSize(); // 2
        s.position(3); // Element found at position: 1
    }
}
