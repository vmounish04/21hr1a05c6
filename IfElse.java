import java.util.Scanner;

public class IfElse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        if(j==0)
        {
            System.out.println("Division by Error");

        }
        else
        {
            System.out.println(i +"Divided by "+j+" is "+(i/j));
            

        }
    }
    
}
