import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a number :");
        int num = sc.nextInt();

        if (num%2==0)
        {
            System.out.println(num+" is a Even number");

        }
        
        else{
            System.out.println(num+" is a Odd Number");

        }

        if (num/2*2==num)                    // 8/2=4 4*2=8 is a even number
        {
            System.out.println(num+" it is a Even Number");

        }
        else
        {
            System.out.println(num+" it is a Odd number");
            
        }
    }
}
