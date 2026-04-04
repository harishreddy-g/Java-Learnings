package LIST;
import java.util.*;
 class vectorInbuilt{
    Vector<Integer> vector = new Vector<>();
    void add(int x){
        vector.add(x);
    }
    void addAt(int index , int x){
        vector.add(index , x);
    }
    void set(int index ,int x){
        vector.set(index, x);
    }
    void get( int index){
        System.out.println(vector.get(index));
    }
    void remove(int x){
        vector.remove(Integer.valueOf(x));
    }
    void removeAt(int index){
        vector.remove(index);
    }
    void sortAscending(){
        Collections.sort(vector);
    }
    void sortDescending(){
        Collections.sort(vector , Collections.reverseOrder());
    }
    void getSize(){
        System.out.println(vector.size());
    }
    void firstElement(){
        System.out.println(vector.firstElement());
    }
    void lastElement(){
        System.out.println(vector.lastElement());
    }
    void removeAll(){
        vector.clear();
    }
    void removeFirst(){
        vector.remove(0);
    }
    void removeLast(){
        vector.remove(vector.size() - 1);
    }
 }

public class vctor {
    public static void main(String[] args){
        vectorInbuilt vec = new vectorInbuilt();
        vec.add(5);
        vec.add(3);
        vec.add(8);
        vec.addAt(1, 10);
        vec.getSize(); // 4
        vec.firstElement(); // 5
        vec.lastElement(); // 8
        vec.get(2); // 3
        vec.set(2, 7);
        vec.removeAt(1);
        vec.getSize(); // 3
        vec.remove(5);
        vec.getSize(); // 2
        vec.sortAscending();
        System.out.println(vec.vector); // [7, 8]
        vec.sortDescending();
        System.out.println(vec.vector); // [8, 7]
        vec.removeFirst();
        System.out.println(vec.vector); // [7]
        vec.removeLast();
        System.out.println(vec.vector); // []

    }
}
