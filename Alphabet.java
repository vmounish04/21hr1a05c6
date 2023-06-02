import java.util.*;

public class Alphabet
{    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        char var = sc . next().charAt(0);

        if((var>='a'&& var<='z') || (var>='A' && var<='Z'))
        {
          System.out.println(var+" is a Alphabet ");
        }
        else                   //if(var>='0' && var<='9')
        {
            System.out.println(var+" is not an Alphabet");
        }

        sc.close();


    }
    
  
}
