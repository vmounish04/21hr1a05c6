public class TestStringComparsion {

    public static void main(String[] args) {
        String s1 ="Dhoni";
        String s2 ="Dhoni";   // Referens are same It refering to same objects
        String s6 = "DHONI";

        String s3 = new String("DHONI");

        String s4 = "Ms Dhoni";

        String s5 = new String("Dhoni");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        System.out.println(s1.equalsIgnoreCase(s3)); //true  it refers the content 
        System.out.println(s1.equals(s4)); //false
        
        System.out.println();

        System.out.println(s1==s2); // It(s1 and s2) refers to same object
        System.out.println(s1==s6); // s1 is different reference and s6 different reference and different objects
        System.out.println(s1==s5); // s1 is different reference and s6 different reference and different objects
    }
    
}
