// This is also a run time polymorphism

class ForestAnimals
{
    public void move()
    {
        System.out.println("Call from ForestAnimals class");
    }
}

class Wild extends ForestAnimals{
    public void move()
    {
        System.out.println("Call from wild class");
    }
}

class Pet extends ForestAnimals
{
    public void move()
    {
        System.out.println("Call from Pet class");
    }
}
public class PolymorphismConst {
    public static void main(String[] args)
    {

    ForestAnimals a = new ForestAnimals();//ForestAnimals referens and object
    ForestAnimals w = new Wild();//ForestAnimals referens but Wild object
    ForestAnimals p = new Pet();//ForestAnimals referens but Pet object

    a.move();//runs the method in ForestAnimals class
    w.move();//runs the method in Wild class
    p.move();//runs the method in Pet class
    
}

}
