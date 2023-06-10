 import java.util.Scanner;
public class PrimeNum
{
  public static void main(String a[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	int n=sc.nextInt();
	int len=0,count=0;
	for(int i=1;i<=n;i++)
	{
	  if(n%i==0)
	  {
		  count++;
		  len = len+i;

		  System.out.print(i);
	     if(i<n)
		{
		   System.out.print(",");
		}

		 
	  }
	  
	}
	System.out.println("\nthe count is :"+len);
	if(count == 2)
		System.out.println("PRIME");
	else
		System.out.println("NOTPRIME");
}
} 


