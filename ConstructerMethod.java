
 class Constructer
{
    
    int rollno;
    String name;

    Constructer()

    {
        rollno=0;
        name=null;
    }

    Constructer(int a,String b)  // constructer does not have return type 

    {
        rollno =a;
        name =b;

    }

    void display()
    {
        System.out.println("Roll no : "+rollno);
        System.out.println("Name : "+name);
    }
}

 class ConstructerClass
  {
    public static void main(String[] args)
    {
        Constructer std = new Constructer(100,"mounish");
        Constructer std1 = new Constructer(101,"jagadhesh");


        std.display();

        std1.display();

       



    }

    
}





