class Animal
{
    void eat()
    {
        System.out.println("Eating...");
    }

}

class Dog extends Animal{
    void eat()
    {
        System.out.println("Eating bread");
    }
    void bark()
    {
        System.out.println("Barking...");
    }
    void work()
    {
        super.eat();  //super keyword allways refers to immediate Parent class Method
        bark();
    }
}
public class SuperKeyMeth {
    public static void main(String[] args)
    {
        Dog dg = new Dog();
        dg.work();
    }
    
}
