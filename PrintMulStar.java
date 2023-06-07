import java.util.Scanner;

public class PrintMulStar
{  
      public static void print_multiple_star()
    {
        System.out.print("*");
    }


    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      int num = sc.nextInt();
      int i=1;
      for(;i<=num;i++)
      {
        print_multiple_star();

        System.out.print("");

      }
    }
}