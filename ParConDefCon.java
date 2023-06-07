class Pctdc
{

    //calling parameter Constructor from Default Constructor
    Pctdc()
    {
        this(5);  // This keyword calls the parameter Constructor
        System.out.println("Hello ");
    }

    Pctdc(int x)
    {
        System.out.println(x);
    }

}

public class ParConDefCon {
    public static void main(String[] args) {
        Pctdc pc = new Pctdc();  // we are calling Default Constructor
    }
    
}
