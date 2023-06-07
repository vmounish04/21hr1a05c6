public class CopyConstructor {
    int id,age;
    String name;
    CopyConstructor(int a,String b)
    {
        id =a;
        name =b;
    }
     
    CopyConstructor()
    {

    }
   
       

    void display()
    {
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
    }
    public static void main(String[] args)
    {
        CopyConstructor sc = new CopyConstructor(1200 ,"mounish");
        CopyConstructor sc1 = new CopyConstructor();
        sc1.id = sc.id;
        sc1.name = sc.name;

        sc.display();
        sc1.display();
    }

}
