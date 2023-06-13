public class MulCatcBlockEX1 {


  public static void main(String args[])
  {
       int a[]=new int[5];
	   a[0]=2;a[1]=4;a[2]=9;a[3]=8;a[4]=10;
    try{
	  for(int i=0;i<=5;i++)
	  System.out.println(a[i]);
	}
	 catch(ArithmeticException e)
   {  System.out.println("Arithmetic Exception occurs");}
   catch(ArrayIndexOutOfBoundsException e)
   {  System.out.println("ArrayIndexOutOfBoundsException occurs");}
   catch(Exception e)
   {  System.out.println("Parent Exception occurs");}
   System.out.println("rest of the code...");

}

}

        
    

