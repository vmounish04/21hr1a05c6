import java.util.Scanner;

public class MulCallFunction {

    public static void pattern(int a,char b)
    {
        for(int i=1;i<=a;i--)      // for Decreasing Triangle for(int i=a;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
        
            System.out.print(b);

            }
            System.out.println();
        }

    }

    public static void callfun(int a,char b)
    {
        pattern(a,b);
    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
       
        System.out.print("Enter a Character :");
        char ch = sc.next().charAt(0);

          
        System.out.print("How many times :");
        int num = sc.nextInt();


        callfun(num,ch);


    }
    
}
