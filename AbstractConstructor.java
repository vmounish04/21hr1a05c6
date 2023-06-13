abstract class Bikes
{
    Bikes()
    {
        System.out.println("Bike is created");

    }

    abstract void run();
    void changeGear()
    {
        System.out.println("Gear is changed");
    }
    
}
// Creating a Child class which inherits Abstract class

class Honda extends Bikes{
    void run()
    {
        System.out.println("Running safely");
    }
}
public class AbstractConstructor {
    public static void main(String[] args)
    {
        Bikes obj = new Honda();  //Bike is referens But Honda is object
                                  // first it calls Bike Constructor after run and changeGear Method

        obj.run();
        obj.changeGear();

    }
    
}
