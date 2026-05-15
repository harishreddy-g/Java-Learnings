class Demo {
    int pow(int x , int y){
        if(y <1){
            return 1;
        }
        return x*pow(x,y-1);
    }
}

public class Recursion {
    public static void main(String[] args) {
        Demo d =new Demo();
        System.out.println(d.pow(2,4));
    }
}
