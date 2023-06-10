import java.util.Scanner;

public class PatternHash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int num = sc.nextInt();

        int space=num-1;


        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("#");
            }

            space--;

            

            for(int j=1;j<=i;j++)
            {

            System.out.print(ch);

            }

            System.out.println();

            

        }

    }


    
}
