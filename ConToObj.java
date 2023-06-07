import javax.swing.text.AbstractDocument.Content;

public class ConToObj {

    int id,age;
        String name;
        ConToObj(int a,String b)
        {
            id =a;
            name =b;
        }
         
        ConToObj(ConToObj s)
        {
            id=s.id;
            name =s.name;
            
        }
    
        void display()
        {
            System.out.println("Id :"+id);
            System.out.println("Name :"+name);
           
        }
    public static void main(String[] args)
    {
        ConToObj sc = new ConToObj(1010,"Mounish");
        ConToObj sc1 = new ConToObj(sc);

        sc.display();
        sc1.display();
        
    
    }
    
}
