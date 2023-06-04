public class TestImmutableString {
    public static void main(String[] args)
    {
        String ms;

        String s="Mahander Singh";

        s.concat("Dhoni"); // It prints only Mahander singh

        System.out.println(s);

        ms = s.concat(" Dhoni");  // If we store in a variable then it prints "Mahander Singh Dhoni"

        System.out.println(ms);


    }
    
}
