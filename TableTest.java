import java.util.Scanner;
public class TableTest {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        char sp =' ';

       

        for (int i=0;i<=10;i++)
        {
            System.out.println(num+" * "+i+"="+i*num);
 
        }


    }
    
}
