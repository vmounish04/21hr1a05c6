public class StudentClass2 {
    int id ;
    String str ;
    
}

class TestStudent
{
    public static void main(String[] args)
    {
        StudentClass2 std1= new StudentClass2();
        StudentClass2 std2 = new StudentClass2();

        std1.id=100;
        std1.str="V mounish";

        std2.id=101;
        std2.str ="Naruto";

        System.out.println(std1.id);
        System.out.println(std1.str);

        System.out.println(std2.id);
        System.out.println(std2.str);

    }
}
