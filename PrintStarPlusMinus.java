import java.util.Scanner;

public class PrintStarPlusMinus {
    public static void print_chars(int i,char c)
    {
        int k=0;
        for(k=1;k<=i;k=k+1)
        {
            System.out.print(c);

        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int j = sc.nextInt();

        print_chars(j,'*');
        print_chars(j+1,'+');
        print_chars(j+2,'-');
        System.out.println();

    }
    
}
