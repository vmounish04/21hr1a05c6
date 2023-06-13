import java.util.Scanner;

 class Test {
    void print()
    {
        System.out.println("Welcome");
    }
    void print(String n)
    {
        System.out.println("Welcome "+n);
    }
    
}

public class PolymorphismEx
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Test ob1 = new Test();

        ob1.print();

        System.out.println("Please Type Your name :");
        String s = sc.next();

        ob1.print(s); // over riding  this is complie time polymorphism 
    }

}
