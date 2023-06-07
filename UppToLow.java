import java.util.Scanner;

public class UppToLow {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str;  //To hold String

        String rs = ""; // To hold Reveresed String

        System.out.println("Enter a String :");

        str = sc.next();

        String temp="";

        int asci;

        int len = str.length()-1; 

        for(int i=len;i>=0;i--)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
            asci=str.charAt(i);
            asci+=32;
            temp =temp+(char)asci;
             }
             else if(str.charAt(i)>='a' && str.charAt(i)<='z')
             {
                asci = str.charAt(i);
                asci-=32;
                temp = temp +(char)asci;

             }
        }

        System.out.println(temp);

        /* for(int j=len;j>=0;j--)
        {
            rs+=str.charAt(j);
        }

        if(temp.equals(rs))
        {
            System.out.println("YES it is Palindrome");

        }
        else
        {
            System.out.println("NO it is Not Palindrome");
        } */





    }
    
}
