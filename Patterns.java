import java.util.Scanner;



    


public class Patterns {


    public static void pattern(int a ,char b)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(b);

            }
            System.out.println();

        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character :");
        char ch = sc.next().charAt(0);
        
        System.out.print("How many patterns :");
        int num = sc.nextInt();

        pattern(num,ch);



    }

    
}
