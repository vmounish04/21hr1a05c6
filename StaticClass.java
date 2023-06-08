public class StaticClass {

    static int data =30;
    static class Inner   // Nested class
    {
        void msg()
        {
            System.out.println("Data is "+data);
        }
    }

    public static void main(String[] args)
    {
        StaticClass.Inner obj = new StaticClass.Inner();  // creating object for Inner class
        obj.msg();
    }
    
}
