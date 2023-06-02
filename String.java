
import java.util.*;


public class String 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String word =sc.next();

        char letter = word.charAt(0);

        System.out.println("Welcome "+word);

        sc.close();
    }
    
}
