public class FinalKey {

    //final 
    int speedlimit = 90; // if we write final variable(error)          // final key word goes not allows
                                                                      //  - method overriding
    void run()                                                        //  - change of value
    {                                                                 
        speedlimit = 400; // Error : cannot assign a value to final variable;
        System.out.println(speedlimit);

    }

    public static void main(String[] args)
    {
        FinalKey sc = new FinalKey ();

        sc.run();

    }
    
}
