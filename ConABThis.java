class B
{
    ConABThis obj;
    B(ConABThis obj)
    {
        this.obj=obj;
    }

    void display()
    {
        System.out.println(obj.data);  // using data member ConABThis
        
        
    }
}
public class ConABThis {
    int data=10;

    ConABThis()
    {
        B b = new B(this); //B b = new B(a);
        b.display();
    }

     public static void main(String[] args)
     {
        ConABThis a = new ConABThis();

     }
    
}
