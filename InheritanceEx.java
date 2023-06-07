import java.util.Scanner;

class SuperClass
{
    float salary=50000;
}
class SubClass extends SuperClass
{
    int bonus =10000;
}
public class InheritanceEx {

    public static void main(String[] args)
    {
        SubClass sc = new SubClass();
        System.out.println("Programmer Salary :"+sc.salary);
        System.out.println("Bonus of Programmer :"+sc.bonus);



    }
    
}
