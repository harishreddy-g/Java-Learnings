class thing{
    String name;
    static String description;
   
    thing (String description){
        this.description = description;
    }
    void setName(String name){
        this.name = name;
    }
    void display(){
        System.out.println("hi ! iam " + name + " and i am a " + description);
    }
}



public class stc {
    public static void main(String[] args){
        thing obj1 = new thing("car");
        obj1.setName("harish reddy");
        obj1.display();

        thing obj2 = new thing("bike");
        obj2.setName("harish reddy");
        obj2.display();

    }
}
