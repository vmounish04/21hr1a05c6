class C
{
    public void display()
    {
        System.out.println("Method class C");
    }

}

class A extends C
{
    public void display()
    {
    System.out.println("Method class A");
}

}

class B extends C{
   public void display()
    {
        System.out.println("Method class B");
    }
}

class D extends C
{
    public void display()
    {
        System.out.println("Method class D");
    }
}

public class HybridLevInher {

    public static void main(String[] args)
    {
        D obj = new D();
        obj.display();
        

    }
   
}
