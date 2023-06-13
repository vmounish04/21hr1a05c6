//user-defined exception in java
import java.util.*;
// custom exception to validate age with defined age limit 
 class AEx extends Exception{

    //member variable to store our custom message
    String msg;
    AEx(String msg)
    {
        //passing the parameter to the super class constructor
        super(msg);
        this.msg=msg;
    }
    //overriding with our custom message
    @Override
    public String toString()
    {
        return msg;
    }


    
}

class AgeException
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name :");
        String str = sc.nextLine();

        System.out.println("Enter your ID :");
        int id = sc.nextInt();

        System.out.println("Enter your age :");
 
        int age=sc.nextInt();
        try{
            if(age<18)
            {
                //checking if the age is above the limit or not 
                throw new AEx("Entered age doesnt fulfill the required age limit");

            }
            else{
                System.out.println("Name:"+str);
                System.out.println("Id :"+id);
                System.out.println("Age :"+age);

            }
        }
        catch(AEx ex)
        {
            //calls override toString() method
            System.out.println(ex);
            //prints message passed to the super constructer
            System.out.println(ex.getMessage());
        }
    }
}
