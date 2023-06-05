import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str;  //To hold String

        String rs = ""; // To hold Reveresed String

        System.out.println("Enter a String :");

        str = sc.next();

        int len = str.length()-1;

        for(int i=len;i>=0;i--)
        {
            System.out.print(str.charAt(i));

        }



    }
    
}
