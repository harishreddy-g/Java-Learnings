class Mthd1{
    void greet(){
        System.out.println("hi ! iam harish reddy");
    }
    int add(int a , int b){
        return a + b;
    }
    String name(String name){
        return name;
    }
    Double multiply(double x , double y){
        return x * y;
    }
    long factorial(int n){
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}


public class method1 {
    public static void main(String[] args) {
        Mthd1 obj = new Mthd1();
        obj.greet();

        int sum = obj.add(5, 10);
        System.out.println("Sum: " + sum);

        String name = obj.name("harish reddy");
        System.out.println("Name: " + name);

        double product = obj.multiply(3.5, 2.0);
        System.out.println("Product: " + product);

        long fact = obj.factorial(5);
        System.out.println("Factorial of 5: " + fact);
       
    }
}
