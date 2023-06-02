import java.util.*;
public class Ascii {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character :");
        char letter = sc.next().charAt(0);

        int num = (int)letter;

        System.out.println("Ascii of "+letter+"is "+num);



    }
    
}
