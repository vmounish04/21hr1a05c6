// This is run time polymorphism

class Cow
{
    public void move()
    {
        System.out.println("Cow can move");
    }
}
class Chicken extends Cow
{
    public void move()
    {
        System.out.println("Hen can walk and run");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args)
    {
        Cow c = new Cow();//Cow referens and object
        Cow c1= new Chicken(); //Cow referens but Chicken object

        c.move();// runs the method in Cow class
        c1.move();// runs the method in Chicken class
    }
    
}
