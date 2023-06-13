import java.util.Scanner;

public class SeriesDigit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        int x=0;

        for(int i=0;x<=num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(x++);
                
                
                if(x<num+1)
                {
                    System.out.print(",");
                }
                

            
            }

            System.out.println();
        }
    }
}
