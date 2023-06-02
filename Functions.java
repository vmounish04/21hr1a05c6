import java.util.Scanner;

public class Functions {
   static int diff(int a,int b)
    {
        return (a-b);
    }

   static int product(int a,int b)
    {
        return (a*b);

    }

    static int small(int a,int b)
    { 
        if (a<b)
        {
            return a;
        }
        else{
            return b;
        }
     
    }

   static int large(int a,int b)
    {
        if (a>b)
        {

            return a;

        }

        else 
        {
            return b;
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value :");
        int a = sc .nextInt();

        System.out.println("Enter b value :");
        int b = sc .nextInt();

        System.out.println("Difference :"+ diff(a,b));
        System.out.println("Product :"+product(a, b));
        System.out.println("lagestNUmber :"+large(a, b));
        System.out.println("smallerNumber :"+small(a, b));

        
    }

    
}
