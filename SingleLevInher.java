class Animal
{
    void eat()
    {
        System.out.println("Eating...");
    }
}

class Pet extends Animal
{  void sleep()
    {
        System.out.println("Sleeping...");
    }

}

public class SingleLevInher {

    public static void main(String[] args)
    {
        Pet dg = new Pet();

        dg.eat();
        dg.sleep();

    }
    
}
