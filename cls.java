// class is a blueprint for creating objects. It defines the properties and behaviors of an object.

class person {
    // attributes or data states
    String name;
    int age;

    // method
    void display() {
        System.out.println("Hi , Iam " + name + " and I am " + age + " years old.");

    }
}

public class cls {
    public static void main(String[] args) {
        person p1 = new person();// p1 is an object of class person
        p1.name = "harish";
        p1.age = 20;
        p1.display();

    }
}
