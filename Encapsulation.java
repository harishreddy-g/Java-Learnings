class Student {
    private String name;
    private int age;

    void setName(String n) {
        name = n;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("harish");
        s1.setAge(20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
