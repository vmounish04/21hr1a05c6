import java.util.Scanner;
import java.util.Arrays;

public class SortElement {
    public static void main(String[] args)
    {
        int n,i=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array :");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the Array Elements :");

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        Arrays.sort(a);
        for(int j:a )
        {
            System.out.println(j+"");
        }


    }
    
}
