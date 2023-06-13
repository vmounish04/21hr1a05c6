// super keyword where super() is done by compiler implicity
class Forests
{
    Forests()
    {
        System.out.println("Forest is very green");
    }
}

class EarthI extends Forests{
    EarthI()
    {
        //super keyword called by complier implicity
        System.out.println("Earth is very Big...");
    }
}


    
    


public class ImpliSuperKey {

    public static void main(String[] args) {
        EarthI ea = new EarthI();
        
    }

    
}
