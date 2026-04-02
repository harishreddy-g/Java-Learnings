class animal {
    private String name;
    private int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setDetails(String name, int age) {
        setName(name);
        setAge(age);
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class method3 {
    public static void main(String[] args) {
        animal a = new animal();
        a.setDetails("Dog", 5);
        System.out.println("Name: " + a.getName() + ", Age: " + a.getAge());
    }
}
