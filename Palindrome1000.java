import java.util.Scanner;
public class Palindrome1000 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :");

        int num = sc.nextInt();

        int rem=0,rev=0,temp=num;

        while(num>0)
        {
            rem = num%10;
            rev = rev*10+rem;
            num=num/10;


        }

        if(temp==rev)
        {
            System.out.println(temp+" is Palindrome");
        }
        else
        {
          System.out.println(temp+" Not Palindrome");
        }

        
    


        
    }
    
}
