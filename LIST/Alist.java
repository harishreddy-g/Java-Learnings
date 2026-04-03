package LIST;

import java.util.*;

class Darray {
    List<Integer> list = new ArrayList<>();

    void add(int x) {
        list.add(x);
    }

    void addAt(int index, int x) {
        list.add(index, x);
    }

    void clearlist(){
        list.clear();
    }
    void get(int index) {
        System.out.println(list.get(index));
    }
    void set(int index,int x){
        list.set(index,x);
    }

    void remove(int x) {
        list.remove(Integer.valueOf(x));
    }

    void sortAscending() {
        Collections.sort(list);
    }

    void sortDescending() {
        Collections.sort(list, Collections.reverseOrder());
    }
    void display(){
        System.out.println(list);
    }
    void removeAt(int index){
        list.remove(index);
    }
}

public class Alist {
    public static void main(String[] args) {
        Darray arr = new Darray();
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
        arr.sortDescending();
        arr.display(); // [8, 7, 5]
        arr.clearlist();
        arr.display(); // []
    }
}
