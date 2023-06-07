class Student7{

    int rollno;
    String name,course;
    float fee;
    Student7(int rollno,String name,String course)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student7(int rollno,String name,String course,float fee)
    {
        
        this(rollno,name,course); // if we swap this then you got an ERROR
        this.fee=fee;

    }

    void display()
    {
        System.out.println(rollno+""+name+""+course+"");
    }

}
public class ThiskeyEx2 {
    public static void main(String args[])
    {
        Student7 tk = new Student7(111,"mounish","Java");

        Student7 tk1 = new Student7(111,"mounish","Java",60000f);

        tk.display();
        tk1.display();
    }
    
}
