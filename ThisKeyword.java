class Student
{
    int rollno;
    String name;
    float fee;
     Student(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;

    }

    void display()
    {
        System.out.println(rollno+" "+name+ " "+fee);
    }
}
public class ThisKeyword {
    public static void main(String[] args)
    {
        Student sc = new Student(1234,"mounish",35000f);
        Student sc1 = new Student(567,"nibba",35000f);

        sc.display();
        sc1.display();

    }
    
}
