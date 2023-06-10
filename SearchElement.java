import java.util.Scanner;

class SearchElement
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int n,x,flag=0,i=0; 
        System.out.println("Enter the size of Array :");
         n = sc.nextInt();
         int a[] = new int[n];

         System.out.println("Enter the all Elements :");
         for(i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }

         System.out.println("Enter the Element you want to find :");
         x=sc.nextInt();
         for(i=0;i<n;i++)
         {
            if(a[i]==x)
            {
                flag=1;
                break;
            }
            else{
                flag=0;
            }
         }

         if(flag==1)
         {
            System.out.println("Elements found at position :"+(i+1));
         }
         else{
            System.out.println("Element not found");
         }

         
    }
}