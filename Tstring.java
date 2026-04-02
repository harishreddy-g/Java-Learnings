class outoverride {
    String name = "Harish Reddy";
    int age = 21;

    void print() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class ovrride {
    String Name = "sudha harish";
    int Age = 21;

    public String toString() {
        return "name='" + Name + "', age=" + Age + "";
    }
}

public class Tstring {
    public static void main(String[] args) {
        outoverride o = new outoverride();
        o.print();// without override to string method , we have to call print method to print the
                  // details of the object.
        ovrride p = new ovrride();
        System.out.println(p);// with override to string method , we can directly print the object and it will
                              // call the toString method to print the details of the object.

    }
}
