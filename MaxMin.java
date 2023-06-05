import java.util.Scanner;


public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>num2)
        {
            System.out.println(num1+" is a Max number");
            System.out.println(num2+" is a Min number");
        }
        else if(num1<num2)
        {
           
            System.out.println(num1+" is a Min number") ;
            System.out.println(num2+" is a Max number") ;

        }
       
        else 
        {
            System.out.println("Both are equal");
        }
    } 


    
}
