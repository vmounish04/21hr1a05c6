import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args)

    {
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int i =0;
        while(i<=num)
        {
            System.out.print(i);

            
            if(i<num)   // 10<10 so last , will ne removed
            {
                System.out.print(",");

            }

            i++;

        }

    }
    
}
