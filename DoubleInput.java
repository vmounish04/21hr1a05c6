import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value :");
        double dec = sc.nextDouble();
        
        System.out.println("Enter b value :");
        double dec1 = sc.nextDouble();

        System.out.printf("%f + %f= %f\n",dec,dec1,dec+dec1);
        System.out.printf("%f - %f= %f\n",dec,dec1,dec-dec1);
        System.out.printf("%f * %f= %f\n",dec,dec1,dec*dec1);
        System.out.printf("%f / %f= %f\n",dec,dec1,dec/dec1);

    }
}
