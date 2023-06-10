//super keyword allways referes to Parent call Method
//this keyword allways referes to Current call Method

class Animal
{
    String color= "white";
}

class Dog extends Animal{
    String color="Black";
    void printcolor()
    {
        System.out.println(color);// prints color of Dog class 
        System.out.println(super.color); // prints color of Animal class because "super keyword allways referes to Parent call Method"
    }
}

public class SuperKeyPar {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.printcolor();

    }
    
}
