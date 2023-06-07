class Forest{
    void eats()
    {
        System.out.println("Eating...");

    }
}

class Dogs extends Forest
{
    void sleeps()
    {
    System.out.println("Sleeping...");

   }

}
class BabyDog extends Dogs
{
    void play()
    {
        System.out.println("Playing ");

    }

}

public class MilLevInher {
    public static void main(String[] args) 
    {
        BabyDog bd = new BabyDog();
        bd.sleeps();
        bd.play();
        bd.eats();

    }
    
}
