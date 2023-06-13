public class TryCatchEx5 {
    public static void main(String[] args)
    {
        try{
            int a[]=new int[5];
            a[5]=30/0;

        }
        catch(Exception e)
        {
            System.out.println("Commom task completed");
        }
        catch(ArithmeticException e)  //it is already handled by the catch block for Exception
        {
            System.out.println("ArithmeticException ocurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurs");

        }
        System.out.println("Rest of code...");
    }
    
}
