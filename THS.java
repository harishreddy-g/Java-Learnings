class demo {
    int x;
    void value(int x){
        this.x = x;
    }
    void display(){
        System.out.println(x);
    }
}

public class THS {
    public static void main(String[] args){
        demo d = new demo();
        d.value(10);
        d.display();
    }
}
