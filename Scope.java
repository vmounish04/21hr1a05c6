public class Scope {
    public static void main(String[] args)
    {
        int i=100;
        System.out.println("The value os i is "+i);

        {
            int k=2;

           // System.out.println(j);  it is out of scope
            {
            int j;  // j value will be accused within block only 
            j=55;             //scope
            i=i*j;
            System.out.println(i);
            System.out.println(j);

            System.out.println(k);

            }
        }

        System.out.println(i);

    }
    
}
