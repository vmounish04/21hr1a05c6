import java.util.Scanner;
public class PrintingDaysMonth {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month number :");
        int monnum = sc.nextInt();
   
        System.out.println("Enter a day number :");
        int daynum = sc.nextInt();

       
        switch(monnum)

        {
            case 1:System.out.println("JANUARY");break;
            case 2:System.out.println("FEBURAY");break;
            case 3:System.out.println("MARACH");break;
            case 4:System.out.println("APRIAL");break;
            case 5:System.out.println("MAY");break;
            case 6:System.out.println("JUNE");break;
            case 7:System.out.println("JULY");break;
            case 8:System.out.println("AUGUST");break;
            case 9:System.out.println("SEPTEMBER");break;
            case 10:System.out.println("OCTOBER");break;
            case 11:System.out.println("NOVMBER");break;
            case 12:System.out.println("DECEMBER");break;
            default:System.out.println("INVALID");

        }

        switch(daynum)
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


      sc.close();
    }
    
}
