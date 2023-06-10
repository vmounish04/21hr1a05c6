public class ForEachLoop {
    public static void main(String[] args)
    {// creating an array
        int[] age ={12,14,19,20};
        int sum=0,count=0;


        for(int a:age)  //for-each-loop
        {
            System.out.println(a);
        }

        for(int i=0;i<age.length;i++)
        {
            count++;
            System.out.println(age[i]);
            sum+=age[i];
        }

        System.out.println("Sum :"+sum);
        System.out.println("Ave :"+sum/count);




    }
    
}
