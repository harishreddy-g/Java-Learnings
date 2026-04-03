package LIST;

import java.util.*;

class Llist {
    LinkedList<Integer> list = new LinkedList<>();

    void add(int x) {
        list.add(x);
    }

    void addAt(int index, int x) {
        list.add(index, x);
    }

    void remove(int x) {
        list.remove(Integer.valueOf(x));
    }

    void removeAt(int index) {
        list.remove(index);
    }

    void get(int index) {
        System.out.println(list.get(index));
    }

    void set(int index, int x) {
        list.set(index, x);
    }

    void sortAscending() {
        Collections.sort(list);
    }

    void sortDescending() {
        Collections.sort(list, Collections.reverseOrder());
    }

    void display() {
        System.out.println(list);
    }

    void clearlist() {
        list.clear();
    }

}

public class LinkList {
    public static void main(String[] args) {
        Llist arr = new Llist();
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.addAt(1, 10);
        arr.display(); // [5, 10, 3, 8]
        arr.get(2); // 3
        arr.set(2, 7);
        arr.removeAt(1);
        arr.display(); // [5, 7, 8]
        arr.remove(5);
        arr.display(); // [7, 8]
        arr.sortAscending();
        arr.display(); // [7, 8]

    }
}
