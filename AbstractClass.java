abstract class Bike{
    abstract void run();  //abstract class does not have method body
}

class AbstractClass extends Bike {
    void run()
    {
        System.out.println("running safely");
    } 
    public static void main(String[] args)
    {
        Bike bk = new AbstractClass();

        bk.run();
    }
    
}
