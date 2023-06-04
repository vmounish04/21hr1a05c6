import java.util.Scanner;
public class Test2ExInt {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String str="";

        for(int i=0;i<=num1;i=i+num2)

        {
            System.out.println(str);
            str =str+i+",";

           /*  if(i%num2==0)
            {
                System.out.print(i);

            }

            if(i<num1)
            {   if(i==15)
                {
                    break;

                }
                System.out.print(',');
            }*/
        System.out.println(str);

        }

            for ( int i =0;i<str.length()-1;i++)
            {
                System.out.print(str.charAt(i));

            }
          
          
            
           

        
        
    }
    
}
