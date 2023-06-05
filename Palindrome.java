import java.util.Scanner;

public class Palindrome {
  
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        int num,rev=0,rem=0;
        System.out.print("Enter any positive Integer :");
        num =sc.nextInt();
        int temp=num;

        while(num>0)       
        {
            rem = num%10;     
            rev = rev*10+rem;  
            num = num/10;     
        }
        if(temp==rev)
        {
            System.out.println("It is a Palindrome");

        }
        else
        {
            System.out.println("It's not a Palidrome");
        }



    } 

    
}

    

