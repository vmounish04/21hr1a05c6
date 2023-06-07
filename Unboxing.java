public class Unboxing {

    public static void main(String[] args)
    {
        Integer a = new Integer(3);
        int i =a.intValue();  //converting int to Integer by user (Explicity)

        int j=a;  //unboxing, now complier will write a.intValue internally

        System.out.println(a+" "+" "+i+" "+j);


        



    }
    
}
