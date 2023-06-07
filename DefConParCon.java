class King
{   
    // calling default Constructor from parameter Constructor
    King()
    {
        System.out.println("Hello King");

    }

    King(int a)
    {            // this keyword calls current class Method
        this();  // it is used to call default Constructor
        System.out.println(a);
    }


}

public class DefConParCon {
    public static void main(String[] args)
    {
        King kg = new King(19);// we are calling the parameter Constructor
    }
    
}
