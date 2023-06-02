import java.util.Scanner;
public class Swaping_without_third_var 
{   

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    

        int num1 = sc.nextInt();//5
        int num2 = sc.nextInt();//4
       
        num1 = num1+num2;   //5+4 = 9
        num2 = num1-num2;   //9-5 = 4       // without using third variable
        num1 = num1-num2;   //9-4 = 5

        System.out.println("num1 ="+num1+"\nnum2 ="+num2);
        

}

}
