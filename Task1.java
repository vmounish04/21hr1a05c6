import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str= sc.nextLine();
    int count=0;

    for (int j=1;j<str.length();j++)
    {
        if ((str.charAt(j)=='0')||(str.charAt(j)=='1')||(str.charAt(j)=='2')||(str.charAt(j)=='3')||(str.charAt(j)=='4')||(str.charAt(j)=='5')||(str.charAt(j)=='6')||(str.charAt(j)=='7')||(str.charAt(j)=='8')||(str.charAt(j)=='9'))
        {
            count++;
        }

    }

    System.out.println("The digits count is "+count);
        
    }
    
}
