import java.util.Scanner;

public class Swaping
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    

        int num1 = sc.nextInt();//5
        int num2 = sc.nextInt();//4
        int temp;
                                        //ex= input 5 7
        temp = num1; //temp =5          //    output 7 5
        num1 = num2; //num1 = 4
        num2 = temp; //num2= 5

        /*num1 = num1+num2;   //5+4 = 9
        num2 = num1-num2;   //9-5 = 4       // without using third variable
        num1 = num1-num2;   //9-4 = 5  */

        System.out.println("num1 ="+num1+"\n num2 ="+num2);


    }
}