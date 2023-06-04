import java.util.Scanner;

class Calculation
{
    void fact()
    {
        int factor=1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            factor=factor*i;

        }

        System.out.println("Factorial of "+n+" is "+factor);
    }

}

public class WithoutObject {
    public static void main(String[] args){

        new Calculation().fact(); //without creating class object calling the method


    }
    
}
