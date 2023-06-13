import java.util.Scanner;
public class FebonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sum=0,n;
        int a=0;
        int b=1;

        System.out.println("Enter the nth Value :");
        n= sc.nextInt();

        System.out.println("Fibonacci Series:");
        while(sum<=n)
        {                                 // 0 1 1 2 3 5 8 13 21 34 
            System.out.print(sum+" ");   //0+1=1 1+1=2 2+3=5 3+5=8 5+8=13 8+13=21 13+21=24
            a=b;  // swap elements
            b=sum;
            sum =a+b;  // next term is the sum of the last two terms 
        }

    }
    
}
