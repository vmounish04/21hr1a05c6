//final 
class Bikes   // error if we use final keyword
{

}

    
 class FinalClass extends Bikes
 {
    void run()

    {
        System.out.println("running safely with");
    }
    public static void main(String[] args) 
    {
        FinalClass fc = new FinalClass();
        fc.run();
        
    }
        

}
