import java.util.Scanner;

public class ReplaceString {
  

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String :");

        String str = sc.nextLine();

        System.out.println("Which Value Want to Replace :");

        String a = sc.next();

        System.out.println("New Value to Replace :");

        String r = sc.next();


        String rep = str.replaceAll(a,r);

        System.out.println(rep);
        
    }
}

    

