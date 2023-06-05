import java.util.Scanner;

public class SumOfNat {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
       
        int num = sc.nextInt();

      int total=0;

        for(int i=1;i<=num;i++)
        {

            System.out.print(i);
            if(i<num)  // 10<10 so last + will be removed
            {
                System.out.print(" + ");

            }  

            

            total= total +i;  // sum of numbers

            

            if(i==num)  // here 10==10 so total will be printed
            {
                System.out.print(" = "+total);
                System.out.println("\n");

            }
            
            
        }

        System.out.println("Sum of "+num+" numbers is "+total);



    }
    
}
