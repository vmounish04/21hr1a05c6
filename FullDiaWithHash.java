import java.util.Scanner;
public class FullDiaWithHash {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int num = sc.nextInt();
        
        int space =num/2;

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print('#');

            }
            

            for(int j=1;j<=num;j++)
            {
               
                
                System.out.print(ch);

                
            }

             for(int j=1;j<=space;j++)
            {
                System.out.print('#');

            }
            space--;

           System.out.println();

        }

        
    }
    
}
