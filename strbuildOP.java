class buildOP{
    StringBuilder sb = new StringBuilder();
    void  add(String s){
        sb.append(s);
    }
    void replace(int index , String s){
        sb.replace(index, index+s.length(), s);
    }
    void delete(int start , int end){
        sb.delete(start, end);
    }
    void insert(int index , String s){
        sb.insert(index, s);
    }
    void reverse(){
        sb.reverse();
    }
    void setLength(int length){
        sb.setLength(length);
    }
    void  printstring(){
        if(sb.length()<+0){
            System.out.println("String is empty");
        }
        else{
            System.out.println(sb.toString());
        }
    }
}

public class strbuildOP {
    public static void main(String[] args){
        buildOP b = new buildOP();
        b.add("Hello, ");
        b.add("World!");
        b.printstring();
        b.replace(7, "Java");
        b.printstring();
        b.delete(5, 7);
        b.printstring();
        b.insert(5, ", ");
        b.printstring();
        b.reverse();
        b.printstring();
        b.setLength(5);
        b.printstring();

    }
}
