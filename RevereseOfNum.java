import java.util.Scanner;
public class RevereseOfNum {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        int num,rev=0,rem=0;
        System.out.print("Enter any positive Integer :");
        num =sc.nextInt();

        while(num>0)       // num=123
        {
            rem = num%10;     // 123%10 = 3  rem=3          12%10=2  rem=2             1%10=1  rem=1
            rev = rev*10+rem;  // 0*10 =0 +3 = 3  rev=3     3*10+2 = 32  rev=32        32*10+1 = 321   rev =321
            num = num/10;     // 123/10 =12      rev =3     12/10=1      rev=32        1/10=0.1

        }



       System.out.println("Reveresed :"+rev);
    } 

    
}
