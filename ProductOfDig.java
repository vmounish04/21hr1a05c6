import java.util.Scanner;

public class ProductOfDig {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        int num,pd=1,rem=0;
        System.out.println("Enter any positive Integer :");
        num =sc.nextInt();

        while(num>0)
        {
           rem=num%10;     // 432 4*3+2=24
           pd=pd*rem;
           num=num/10;
        }



       System.out.println(pd);
    } 


    
}
