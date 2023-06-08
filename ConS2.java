public class ConS2 {

    void m(ConS2 obj)
    {
        System.out.println("Method is Invockd");
    }

    void p()
    {
        m(this);  // this keyword calls the Default Constructor as well as m method
    }

    public static void main(String[] args)
    {
        ConS2 cs = new ConS2();

        cs.p();
        
    }
    
}
