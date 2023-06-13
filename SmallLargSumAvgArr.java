import java.util.Scanner;
import java.util.Arrays;
public class SmallLargSumAvgArr {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int a[] = new int[n];

         for(int i=0;i<n;i++)

         {
            a[i]=sc.nextInt();
         }

         Arrays.sort(a);
                                                          // a[0] is small number in sorted array
         System.out.println(a[0]+" "+a[n-2]+" "+a[n-1]);  // a[n-1] is first largest number in sorted array
                                                          // a[n-2] is second largest number in sorted array
         int sum=0;

         for(int y:a)
         {
            sum+=y;
         }

         float avg = sum/n;

         System.out.println(sum+"\n"+avg);

         

        
    }
    
}
