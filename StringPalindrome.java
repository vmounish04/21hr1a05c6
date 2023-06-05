import java.util.Scanner;

class StringPalindrome
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);


    String str;  //To hold String

    String rs = ""; // To hold Reveresed String

    System.out.println("Enter a String :");

    str = sc.next();

    String temp=str;

    int len = str.length()-1;

    for(int i=len;i>=0;i--)
    {
        str.charAt(i);


    
    }

    if(temp.equals(str))
    {
        System.out.println("This is Palindrome");

    }
    else
    {
        System.out.println("This is not Palindrome");

    }
    



}

}