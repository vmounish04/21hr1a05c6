public class TryCatchException {
    public static void main(String[] args)
    {
        try{
            int data=50/0;//may throw Exception
        }

        //handling the Exception
        catch(Exception e)
        {
            //displaying the custom 
            System.out.println("Can't divided by zero");
            System.out.println(e);

        }
    }
    
}
