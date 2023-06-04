

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");

        StringBuilder s2 = new StringBuilder("world");
        StringBuilder s3 = s1.append(s2);

        System.out.println(s3.toString());
    }
    
}
