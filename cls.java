// class is a blueprint for creating objects. It defines the properties and behaviors of an object.

class person{
    String name;
    int age;
}

public class cls {
    public static void main(String[] args){
        person p1 = new person();// p1 is an object of class person
        p1.name = "harish";
        p1.age= 20;
        System.out.println("Hi , Iam " + p1.name + " and I am " + p1.age + " years old.");

    }
}
