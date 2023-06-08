class Stu
{
    int rollno;//instance variable
    String name;
    static String collage="MTDS";  // static variable

    //constructor

    Stu(int r ,String n)
    {
        rollno =r;
        name =n;

    }

    void display()
    {
        System.out.println(rollno+" "+name+" "+collage);
    }

}

public class StaticVar {
    public static void main(String[] args)
    {
        Stu st = new Stu(1234,"mounish");
        Stu st1 = new Stu(5678,"Lufee");

    //we can change the collage of all objects by the single line of code
        Stu.collage="MTIET";

        st.display();
        st1.display();

    }
    
}
