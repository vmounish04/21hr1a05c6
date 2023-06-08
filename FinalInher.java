 class Bike {

    //final if we use final keyword
          void run() // Error : run() in FinalInher cannot override run() method
        {
            System.out.println("Running ");

        }    
    
}

class FinalInher extends Bike
{
    void run()
    {
        System.out.println("Running safely with 100Kmph");
    }

    public static void main(String[] args)
    {
        FinalInher hd = new FinalInher();
        hd.run();
    };
}


