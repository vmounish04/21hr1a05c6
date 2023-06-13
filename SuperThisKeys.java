class Person
{
    int id;
    String name;
    Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}

class Man extends Person
{
    float salary;
    Man(int id,String name,float salary)
    {
        super(id,name);//reusing parent Constructor
        this.salary=salary; 
    }

    void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }

    


}


public class SuperThisKeys {
    public static void main(String[] args) {
        Man mn = new Man(121,"mounish",50000);

        mn.display();
    }

    
}
