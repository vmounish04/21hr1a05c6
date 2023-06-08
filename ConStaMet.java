 class SampleSta {
    int rollno;
    String name;
    static String collage="MTIE";

    static void change()
    {
        collage="MIDS";
    }
    SampleSta(int a ,String b)
    {
        rollno =a;
        name =b;
    }

    void display()
    {
        System.out.println(rollno+" "+name+" "+collage);
    }
   
    
    
}

public class ConStaMet
{
    
    public static void main(String[] args)
    {
        SampleSta.change();  // we can a method by using class name

        SampleSta c1 = new SampleSta(111,"mounish");
        SampleSta c2 = new SampleSta(222,"Lufee");
        SampleSta c3 = new SampleSta(333,"Naruto");

        c1.display();
        c2.display();
        c3.display();

    }
}
