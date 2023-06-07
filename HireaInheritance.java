class Animals
{
     void eats()
    {
        System.out.println("Eating...");

    }
}

class DOG extends Animals
{
    void bark()
    {
    System.out.println("Barking...");

   }

}
class Cats extends Animals
{
    void play()
    
    {
        System.out.println("Playing... ");

    }

}

 
    


 public class HireaInheritance {

    public static void main(String[] args)
    {
        Cats ct = new Cats();
        
        ct.play();
        ct.eats();

        DOG dg = new DOG();

        dg.bark();
        dg.eats();

    }
   
    
    
}
