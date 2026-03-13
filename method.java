class method1{
    void display(){
        System.out.println("This is a method");
    }

}
class method2{
    int a;
    int b;
    int add(){
        return a+b;
    }
}

public class method {
    public static void main(String[] args){
        method1 obj1 = new method1();
        obj1.display();

        method2 obj2 = new method2();
        obj2.a = 5;
        obj2.b = 10;
        System.out.println("Sum: " + obj2.add());
    }
}
