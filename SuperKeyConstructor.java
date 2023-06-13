class World
{
    World()
    {
        System.out.println("World....");

    }

}
class Forest extends World
{
    Forest()
    {
        System.out.println("Forest is beautiful..");
    }
}

class Earth extends Forest{
    Earth()
    {
        super(); // super keyword allways calls Immediate Parent class Data (instance variable or members,Methods,Constructor)
        System.out.println("Earth is very Big...");
    }
}

class SuperKeyConstructor {
    public static void main(String[] args)
    {

    Earth ea = new Earth(); // calling Earth() constructor

    }
    
}
