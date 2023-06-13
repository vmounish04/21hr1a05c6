import java.util.Scanner;

public class PatternDiff {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        int num = sc.nextInt();
        int space=num/2;

        int log = (num/2)+1;

        

        for(int i=1;i<=log;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("#");
            }

            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print(ch);
            }

            for(int j=1;j<=space;j++)
            {
                System.out.print("#");
            }

            space--;

            System.out.println();
        }

        space=1;

        for(int i=1;i<=log;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("#");
            }

            for(int j=1;j<=(2*(num/2))-1;j++)
            {
                System.out.print(ch);
                num--;
            }

            for(int j=1;j<=space;j++)
            {
                System.out.print("#");
            }

            space++;

            System.out.println();
        }

    
}

}
