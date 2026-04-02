class Builder {
    StringBuilder sb;

    public Builder() {
        sb = new StringBuilder();
    }

    public void add(String s) {
        sb.append(s);
    }

    public String get() {
        return sb.toString();
    }
}

public class strbuild {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.add("Hello, ");
        builder.add("World!");
        System.out.println(builder.get());
    }
}
