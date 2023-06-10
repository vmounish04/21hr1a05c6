import java.util.Scanner;

public class FactReccusion {
    
    public static int calFact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n*calFact(n-1);
            
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num<0)
        {
            System.out.println("INVALID");
            
        }
        else
        {
           System.out.println(calFact(num));
        }

    }
}
