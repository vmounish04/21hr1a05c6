import java.util.Scanner;

public class PatternModel {

    public static void pattern(int a,char b)
    {
        

        for(int i=1;i<=a/2;i++)         // 9/2 = 4   
                                        
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(b);

            }
            System.out.println();
        }

        for(int k=(a-a/2);k>=1;k--)   // 9-(9/2) = 5
        {
            for(int l=1;l<=k;l++)
            {
                System.out.print(b);
            }

            System.out.println();

        }

    }

    public static void callfun(int c,char d)
    {
        pattern(c, d);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int num = sc.nextInt();

        callfun(num,ch);
    }
    
}
