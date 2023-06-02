import java.util.Scanner;

public class EvenOddUsingFun {
    public static boolean isEven(int n)
    {
        return ((n/2)*2==n);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if(isEven(num))
        {
            System.out.println("Even Number");

        }
        else{
            System.out.println("Odd Number");
        }
    }
}
