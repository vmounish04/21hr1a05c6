import java.util.Scanner;
public class VowelsCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count=0;
        
        for(int j=0;j<str.length();j++)
        {
            if ((str.charAt(j)=='a')||(str.charAt(j)=='A')||(str.charAt(j)=='e')||(str.charAt(j)=='E')||(str.charAt(j)=='i')||(str.charAt(j)=='I')||(str.charAt(j)=='o')||(str.charAt(j)=='O')||(str.charAt(j)=='u')||(str.charAt(j)=='U'))
            {
                count++;
            }

        }

        System.out.println("The vowels count are :"+count);

    }
    
}
