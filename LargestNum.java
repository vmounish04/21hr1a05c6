import java.util.Scanner;
public class LargestNum {
    
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+" is Largest");

        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is Largest");

        }
        else if(c>a && c>b)
        {
            System.out.println(c +" is Largest");
        }
        else
        {
            System.out.println("All are Equal");
        }

    }


}
