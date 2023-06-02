import java.util.Scanner;

    class Input
{
    public static int add(int a,int b)
    {
        int c = a+b;
        return c;

    }
public static void main(String[] args)
{
Scanner scob = new Scanner(System.in);
System.out.println("Enter a number :");
int num1 = scob.nextInt();
System.out.println("Enter b number :");
int num2 = scob.nextInt();
System.out.println("num1 :"+num1 +"\tnum2 :"+num2);
System.out.println(num1+"+"+num2+"="+add(num1,num2));
}
}