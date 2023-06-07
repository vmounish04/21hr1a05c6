import java.util.Scanner;
public class ExtractDigitStr {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with number :");
        String str = sc.nextLine();
       
        String exnum="",exstr="";
        
  
        

        for(int i=0;i<str.length();i++)
        {   
            // Extracting the num from string
            // another way if(str.charAt(i)>=0 && str.charAt(i)<=0)
            if(str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3' || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7' || str.charAt(i)=='8' || str.charAt(i)=='9')
            {
               exnum+=str.charAt(i);

            }

            //Extrating the String 
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z' ) )
            {
               exstr+=str.charAt(i);
            }
        }
        System.out.println("Extracted Number : "+exnum);
        System.out.println("Extracted String : "+exstr);





        



    }
}
    

