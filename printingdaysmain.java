import java.util.Scanner;

public class printingdaysmain 
{
    public static void display(int n)
    {
                                                    // by using main we can pass values like function


    switch(n)
    {
        case 0:System.out.println("Sunday");break;
        case 1:System.out.println("Monday");break;
        case 2:System.out.println("Tuesday");break;
        case 3:System.out.println("Wednesday");break;
        case 4:System.out.println("Thursday");break;
        case 5:System.out.println("Friday");break;
        case 6:System.out.println("Saturday");break;
        default:System.out.println("Invalid");


    }
}

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        display(n);

    }


 }


    

