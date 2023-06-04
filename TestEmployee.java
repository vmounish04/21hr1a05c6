class Employee
{
    int id;
    String name;
    float salary;

    void insert(int a,String b,float c)
    {
        id=a;
        name =b;
        salary =c;

    }

    void display()
    {
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Salary :"+salary);
        System.out.println();
    }
}

public class TestEmployee {
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp.insert(2801,"v mounish",70000);
        emp.display();
        emp1.insert(2802,"jack",80000);
        emp1.display();
        emp2.insert(2803,"smarty",85000);
        emp2.display();



    }
    
}
