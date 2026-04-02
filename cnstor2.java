class worker {
    String name;
    int age;

    worker() {
        System.out.println("student 1 is working !");
    }

    worker(String name) {
        this.name = name;
        System.out.println("student 2 is working !");
    }

    worker(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("student 3 is working !");
    }
}

public class cnstor2 {
    public static void main(String[] args) {
        worker a =new worker();
        worker b = new worker("harish reddy");
        worker c = new worker("harish reddy", 20);
    }
}
