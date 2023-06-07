public class ParaConstructor {


    int id,age;
    String name;
    ParaConstructor(int a,String b)
    {
        id =a;
        name =b;
    }
     
    ParaConstructor(int a,String b,int c)
    {
        id=a;
        name =b;
        age =c;
    }

    void display()
    {
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }


    public static void main(String[] args)
    {
        ParaConstructor sc = new ParaConstructor(111,"mounish");
        ParaConstructor sc1 = new ParaConstructor(1221,"mounish", 19);

        sc.display();
        sc1.display();
    }
    
}
