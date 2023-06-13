public class MultipleCatchBLock {
    public static void main(String[] args)
    {
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithemetic EXception Occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception Occurs");
        }

        System.out.println("Rest of code");

    }
    
}
