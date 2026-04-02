class student {
    String name;
    int age;
    student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("hi ! iam " + name + " and my age is " + age);
    }
}
public class cnstor {
    public static void main(String[] args) {
        student obj = new student("harish reddy", 20);
        obj.display();
    }
}