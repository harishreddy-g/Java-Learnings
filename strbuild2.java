class builder2 {
    void immutable() {
        /*
         * while "s" is updating to new value , This is how java is handling :
         * String temp = new StringBuilder()
         * .append(s)
         * .append(" World")
         * .toString();
         * 
         * s = temp;
         * 
         * new temp is created .
         * so this is too slow process.
         */
        String s = "Hello";
        s += " World!";
        System.out.println(s);
    }

    void mulatble() {
        // java does not create new object for string builder , it just update the
        // existing object and return the reference to the same object.
        StringBuilder sb = new StringBuilder();
        sb.append("HI !").append("I am Harish Reddy").append("And , I am 3rd year strudent at IIITSricity");
        System.out.println(sb.toString());
    }
}

public class strbuild2 {
    public static void main(String[] args) {
        builder2 b = new builder2();
        b.immutable();
        b.mulatble();

    }
}
