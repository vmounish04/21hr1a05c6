public class StringCapacity {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity()); // default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // now 16
        sb.append("Java is my Favourite Languages");
        System.out.println(sb.capacity());  // now(16*2)

    }
    
}
